package observer.banking.model;

import observer.banking.enums.TransactionType;
import observer.banking.record.Transaction;
import observer.banking.subscriber.AccountObserver;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @Author: Soe Ye Aung
 * @Date: 24/3/25
 * @Time: 5:31 pm
*/

public class Account {
    private final String accountNumber;
    private final String accountType;
    private BigDecimal balance;
    private final Customer owner;
    private final List<AccountObserver> observers = new ArrayList<>();

    public Account(String accountNumber, String accountType, BigDecimal initialBalance, Customer owner) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = initialBalance;
        this.owner = owner;
    }

    public void deposit(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }

        BigDecimal oldBalance = this.balance;
        this.balance = this.balance.add(amount);

        Transaction transaction = new Transaction(
                UUID.randomUUID().toString(),
                LocalDateTime.now(),
                amount,
                TransactionType.DEPOSIT,
                "Deposit to account " + accountNumber,
                oldBalance,
                this.balance
        );

        notifyObservers(transaction);
    }

    public void withdraw(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive");
        }

        if (balance.compareTo(amount) < 0) {
            throw new IllegalStateException("Insufficient funds");
        }

        BigDecimal oldBalance = this.balance;
        this.balance = this.balance.subtract(amount);

        Transaction transaction = new Transaction(
                UUID.randomUUID().toString(),
                LocalDateTime.now(),
                amount,
                TransactionType.WITHDRAWAL,
                "Withdrawal from account " + accountNumber,
                oldBalance,
                this.balance
        );

        notifyObservers(transaction);
    }

    public void transfer(Account targetAccount, BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Transfer amount must be positive");
        }

        if (balance.compareTo(amount) < 0) {
            throw new IllegalStateException("Insufficient funds for transfer");
        }

        BigDecimal oldBalance = this.balance;
        this.balance = this.balance.subtract(amount);

        Transaction transaction = new Transaction(
                UUID.randomUUID().toString(),
                LocalDateTime.now(),
                amount,
                TransactionType.TRANSFER,
                "Transfer to account " + targetAccount.getAccountNumber(),
                oldBalance,
                this.balance
        );

        notifyObservers(transaction);

        targetAccount.receiveTransfer(amount, this.accountNumber);
    }

    private void receiveTransfer(BigDecimal amount, String fromAccountNumber) {
        BigDecimal oldBalance = this.balance;
        this.balance = this.balance.add(amount);

        Transaction transaction = new Transaction(
                UUID.randomUUID().toString(),
                LocalDateTime.now(),
                amount,
                TransactionType.TRANSFER_RECEIVED,
                "Transfer received from account " + fromAccountNumber,
                oldBalance,
                this.balance
        );

        notifyObservers(transaction);
    }

    public void attach(AccountObserver observer) {
        observers.add(observer);
    }

    public void detach(AccountObserver observer) {
        observers.remove(observer);
    }

    private void notifyObservers(Transaction transaction) {
        observers.forEach(observer -> observer.update(this, transaction));
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public Customer getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return STR."Account{accountNumber='\{accountNumber}', accountType='\{accountType}', balance=\{balance}, owner=\{owner.getFullName()}}";
    }
}
