package observer.banking.concreteSubscribers;

import observer.banking.model.Account;
import observer.banking.model.Customer;
import observer.banking.record.Transaction;
import observer.banking.subscriber.AccountObserver;

/**
 * @Author: Soe Ye Aung
 * @Date: 24/3/25
 * @Time: 5:47 pm
 */
public class NotificationService implements AccountObserver {
    @Override
    public void update(Account account, Transaction transaction) {
        switch (transaction.type()) {
            case DEPOSIT -> sendSMS(account.getOwner(),
                    "Deposit of $" + transaction.amount() + " received. New balance: $" + account.getBalance());

            case WITHDRAWAL -> {
                sendSMS(account.getOwner(),
                        "Withdrawal of $" + transaction.amount() + " processed. New balance: $" + account.getBalance());
                sendEmail(account.getOwner(),
                        "Withdrawal Notification",
                        "Dear " + account.getOwner().getFullName() + ",\n\n" +
                                "A withdrawal of $" + transaction.amount() + " has been processed on your account " +
                                account.getAccountNumber() + ".\n\n" +
                                "New balance: $" + account.getBalance() + "\n\n" +
                                "If you did not authorize this transaction, please contact us immediately.\n\n" +
                                "Regards,\nYour Bank");
            }

            case TRANSFER -> {
                sendSMS(account.getOwner(),
                        "Transfer of $" + transaction.amount() + " sent. New balance: $" + account.getBalance());
                pushMobileNotification(account.getOwner(),
                        "Transfer of $" + transaction.amount() + " completed");
            }

            case TRANSFER_RECEIVED -> {
                sendSMS(account.getOwner(),
                        "Transfer of $" + transaction.amount() + " received. New balance: $" + account.getBalance());
            }
        }
    }

    private void sendSMS(Customer customer, String message) {
        System.out.println("SMS to " + customer.getPhoneNumber() + ": " + message);
    }

    private void sendEmail(Customer customer, String subject, String body) {
        System.out.println("Email to " + customer.getEmail());
        System.out.println("Subject: " + subject);
        System.out.println("Body: " + body);
    }

    private void pushMobileNotification(Customer customer, String message) {
        System.out.println("Push notification to " + customer.getCustomerId() + ": " + message);
    }
}
