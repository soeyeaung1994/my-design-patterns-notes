package factory.paymentMethodFactory;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Author: Soe Ye Aung
 * @Date: 7/2/25
 * @Time: 7:16 pm
 */
public sealed interface PaymentMethod permits TelecomPayment, BankPayment, FintechPayment {
    boolean processPayment(BigDecimal amount);
    String getPaymentStatus();
    List<String> getSupportedCurrencies();
}
