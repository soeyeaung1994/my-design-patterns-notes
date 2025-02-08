package factory.authProviderFactory;

/**
 * @Author: Soe Ye Aung
 * @Date: 7/2/25
 * @Time: 3:46 pm
 */
public class GoogleAuth implements AuthProvider {
    @Override
    public void authenticate(String credentials) {

    }

    @Override
    public boolean isAuthenticated() {
        return false;
    }

    @Override
    public void logout() {

    }
    // Similar implementation for Google
}
