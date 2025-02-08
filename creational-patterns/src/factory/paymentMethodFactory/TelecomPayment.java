package factory.paymentMethodFactory;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Author: Soe Ye Aung
 * @Date: 7/2/25
 * @Time: 7:17 pm
 *
 * Bank နဲ့ Fintech payments တွေအတွက်လည်း ဒီလိုပဲရေးမှာပါ
 *
 */
public final class TelecomPayment implements PaymentMethod {
    private final String provider; // MPT, Ooredoo, etc.

    public TelecomPayment(String provider) {
        this.provider = provider;
    }

    @Override
    public boolean processPayment(BigDecimal amount) {
        System.out.println(STR."Processing telecom payment via \{provider}");
        return true;
    }

    @Override
    public String getPaymentStatus() {
        return "SUCCESS";
    }

    @Override
    public List<String> getSupportedCurrencies() {
        return List.of("MMK");
    }
}
