package observer.banking.concreteSubscribers;

import observer.banking.enums.TransactionType;
import observer.banking.model.Account;
import observer.banking.record.Transaction;
import observer.banking.subscriber.AccountObserver;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Soe Ye Aung
 * @Date: 24/3/25
 * @Time: 5:45 pm
 */
public class FraudDetection implements AccountObserver {
    private final BigDecimal suspiciousAmount;
    private final List<Transaction> recentTransactions = new ArrayList<>();
    private final int maxTransactionsToTrack;

    public FraudDetection(BigDecimal suspiciousAmount, int maxTransactionsToTrack) {
        this.suspiciousAmount = suspiciousAmount;
        this.maxTransactionsToTrack = maxTransactionsToTrack;
    }

    @Override
    public void update(Account account, Transaction transaction) {
        // Add transaction to recent list and trim if necessary
        recentTransactions.add(transaction);
        if (recentTransactions.size() > maxTransactionsToTrack) {
            recentTransactions.remove(0);
        }

        analyzeBehavior(account, transaction);
    }

    private void analyzeBehavior(Account account, Transaction transaction) {
        // Check for large transactions
        if (transaction.amount().compareTo(suspiciousAmount) >= 0) {
            flagSuspiciousActivity(account, "Large transaction detected", transaction);
        }

        // Check for multiple withdrawals in a short period
        if (transaction.type() == TransactionType.WITHDRAWAL || transaction.type() == TransactionType.TRANSFER) {
            long withdrawalCount = recentTransactions.stream()
                    .filter(t -> t.type() == TransactionType.WITHDRAWAL || t.type() == TransactionType.TRANSFER)
                    .filter(t -> t.timestamp().isAfter(LocalDateTime.now().minusHours(1)))
                    .count();

            if (withdrawalCount >= 3) {
                flagSuspiciousActivity(account, "Multiple withdrawals in short period", transaction);
            }
        }
    }

    private void flagSuspiciousActivity(Account account, String reason, Transaction transaction) {
        System.out.println(STR."FRAUD ALERT: \{reason}");
        System.out.println(STR."Account: \{account.getAccountNumber()} (\{account.getOwner().getFullName()})");
        System.out.println(STR."Transaction: \{transaction.transactionId()} - \{transaction.type()} - $\{transaction.amount()}");
        System.out.println(STR."Timestamp: \{transaction.timestamp()}");
        System.out.println(STR."Description: \{transaction.description()}");
    }
}
