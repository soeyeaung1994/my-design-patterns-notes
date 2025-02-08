package factory.paymentMethodFactory;

/**
 * @Author: Soe Ye Aung
 * @Date: 7/2/25
 * @Time: 7:21 pm
 */
public class PaymentMethodFactory {
    public static PaymentMethod createPaymentMethod(String type, String provider) {
        return switch (type.toLowerCase()) {
            case "telecom" -> new TelecomPayment(provider);
            case "bank" -> new BankPayment(provider);
            case "fintech" -> new FintechPayment(provider);
            default -> throw new IllegalArgumentException(STR."Unknown payment type: \{type}");
        };
    }
}
