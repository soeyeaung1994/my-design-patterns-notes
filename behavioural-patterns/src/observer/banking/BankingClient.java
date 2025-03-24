package observer.banking;

import observer.banking.concreteSubscribers.FraudDetection;
import observer.banking.concreteSubscribers.NotificationService;
import observer.banking.concreteSubscribers.TransactionLogger;
import observer.banking.model.Account;
import observer.banking.model.Customer;

import java.math.BigDecimal;
import java.util.UUID;

/**
 * @Author: Soe Ye Aung
 * @Date: 24/3/25
 * @Time: 5:50 pm
 */
public class BankingClient {
    public static void main(String[] args) {
        // Create customers
        Customer john = new Customer(
                UUID.randomUUID().toString(),
                "John",
                "Doe",
                "john.doe@example.com",
                "+1234567890"
        );

        Customer jane = new Customer(
                UUID.randomUUID().toString(),
                "Jane",
                "Smith",
                "jane.smith@example.com",
                "+1987654321"
        );

        // Create accounts
        Account checkingAccount = new Account(
                "CHK-" + UUID.randomUUID().toString().substring(0, 8),
                "CHECKING",
                new BigDecimal("1000.00"),
                john
        );

        Account savingsAccount = new Account(
                "SAV-" + UUID.randomUUID().toString().substring(0, 8),
                "SAVINGS",
                new BigDecimal("5000.00"),
                john
        );

        Account janeAccount = new Account(
                "CHK-" + UUID.randomUUID().toString().substring(0, 8),
                "CHECKING",
                new BigDecimal("2500.00"),
                jane
        );

        // Create observers AKA subscribers
        TransactionLogger logger = new TransactionLogger("transactions.log");
        FraudDetection fraudDetection = new FraudDetection(new BigDecimal("1000.00"), 10);
        NotificationService notificationService = new NotificationService();

        // Attach observers to accounts
        checkingAccount.attach(logger);
        checkingAccount.attach(fraudDetection);
        checkingAccount.attach(notificationService);

        savingsAccount.attach(logger);
        savingsAccount.attach(fraudDetection);
        savingsAccount.attach(notificationService);

        janeAccount.attach(logger);
        janeAccount.attach(fraudDetection);
        janeAccount.attach(notificationService);

        // Print initial state
        System.out.println("Initial account states:");
        System.out.println(checkingAccount);
        System.out.println(savingsAccount);
        System.out.println(janeAccount);
        System.out.println();

        // Perform transactions
        System.out.println("Making a deposit to checking account...");
        checkingAccount.deposit(new BigDecimal("500.00"));
        System.out.println("New balance: $" + checkingAccount.getBalance());
        System.out.println();

        System.out.println("Making a withdrawal from savings account...");
        savingsAccount.withdraw(new BigDecimal("1000.00"));
        System.out.println("New balance: $" + savingsAccount.getBalance());
        System.out.println();

        System.out.println("Transferring between accounts...");
        checkingAccount.transfer(janeAccount, new BigDecimal("300.00"));
        System.out.println("Checking account balance: $" + checkingAccount.getBalance());
        System.out.println("Jane's account balance: $" + janeAccount.getBalance());
        System.out.println();

        // Trigger fraud detection
        System.out.println("Making a large withdrawal (should trigger fraud detection)...");
        try {
            savingsAccount.withdraw(new BigDecimal("2000.00"));
        } catch (Exception e) {
            System.out.println("Transaction failed: " + e.getMessage());
        }
        System.out.println("Savings account balance: $" + savingsAccount.getBalance());
    }
}
