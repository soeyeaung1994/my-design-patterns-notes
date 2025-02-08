package factory.authProviderFactory;

/**
 * @Author: Soe Ye Aung
 * @Date: 7/2/25
 * @Time: 3:47 pm
 *
 * Factory class
 *
 */

public class AuthProviderFactory {
    public static AuthProvider createAuthProvider(String type) {
        return switch (type.toLowerCase()) {
            case "facebook" -> new FacebookAuth();
            case "google" -> new GoogleAuth();
            case "email" -> new EmailAuth();
            default -> throw new IllegalArgumentException("Unknown auth provider: " + type);
        };
    }
}
