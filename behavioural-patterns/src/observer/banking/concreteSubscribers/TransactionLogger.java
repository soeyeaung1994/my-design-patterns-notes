package observer.banking.concreteSubscribers;

import observer.banking.model.Account;
import observer.banking.record.Transaction;
import observer.banking.subscriber.AccountObserver;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.format.DateTimeFormatter;

/**
 * @Author: Soe Ye Aung
 * @Date: 24/3/25
 * @Time: 5:38 pm
 */
public class TransactionLogger implements AccountObserver {
    private final String logFile;
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public TransactionLogger(String logFile) {
        this.logFile = logFile;
    }

    @Override
    public void update(Account account, Transaction transaction) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(logFile, true))) {
            writer.println("------ Transaction Log ------");
            writer.println("Timestamp: " + transaction.timestamp().format(FORMATTER));
            writer.println("Account: " + account.getAccountNumber() + " (" + account.getOwner().getFullName() + ")");
            writer.println("Type: " + transaction.type());
            writer.println("Amount: " + transaction.amount());
            writer.println("Description: " + transaction.description());
            writer.println("Previous Balance: " + transaction.previousBalance());
            writer.println("New Balance: " + transaction.newBalance());
            writer.println("-----------------------------");
        } catch (IOException e) {
            System.err.println("Error writing to transaction log: " + e.getMessage());
        }
    }
}
