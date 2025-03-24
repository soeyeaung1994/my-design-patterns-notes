package observer.banking.record;

import observer.banking.enums.TransactionType;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @Author: Soe Ye Aung
 * @Date: 24/3/25
 * @Time: 5:36 pm
 */
public record Transaction(
        String transactionId,
        LocalDateTime timestamp,
        BigDecimal amount,
        TransactionType type,
        String description,
        BigDecimal previousBalance,
        BigDecimal newBalance
) {}
