package factory.paymentMethodFactory;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Author: Soe Ye Aung
 * @Date: 7/2/25
 * @Time: 7:19 pm
 */
public final class BankPayment implements PaymentMethod {
    private final String provider;

    public BankPayment(String provider) {
        this.provider = provider;
    }

    @Override
    public boolean processPayment(BigDecimal amount) {
        return false;
    }

    @Override
    public String getPaymentStatus() {
        return "";
    }

    @Override
    public List<String> getSupportedCurrencies() {
        return List.of();
    }
}
