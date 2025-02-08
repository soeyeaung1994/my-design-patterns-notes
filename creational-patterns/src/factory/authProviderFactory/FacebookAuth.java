package factory.authProviderFactory;

/**
 * @Author: Soe Ye Aung
 * @Date: 7/2/25
 * @Time: 3:46 pm
 *
 * Concrete implementations
 *
 */

public class FacebookAuth implements AuthProvider {
    private boolean authenticated = false;

    @Override
    public void authenticate(String credentials) {
        // Facebook OAuth logic
        System.out.println("Authenticating with Facebook...");
        authenticated = true;
    }

    @Override
    public boolean isAuthenticated() {
        return authenticated;
    }

    @Override
    public void logout() {
        authenticated = false;
    }
}
