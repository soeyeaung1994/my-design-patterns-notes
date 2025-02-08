package factory.authProviderFactory;

/**
 * @Author: Soe Ye Aung
 * @Date: 7/2/25
 * @Time: 3:45 pm
 *
 * Common interface for all auth providers
 *
 */

public interface AuthProvider {
    void authenticate(String credentials);
    boolean isAuthenticated();
    void logout();
}
