package observer.banking.subscriber;

import observer.banking.model.Account;
import observer.banking.record.Transaction;

/**
 * @Author: Soe Ye Aung
 * @Date: 24/3/25
 * @Time: 5:32 pm
 */
public interface AccountObserver {
    void update(Account account, Transaction transaction);
}
