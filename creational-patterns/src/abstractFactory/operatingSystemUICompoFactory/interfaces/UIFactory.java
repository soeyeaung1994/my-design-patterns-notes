package abstractFactory.operatingSystemUICompoFactory.interfaces;

/**
 * @Author: Soe Ye Aung
 * @Date: 8/2/25
 * @Time: 9:45 am
 *
 * Abstract Factory
 *
 */

public interface UIFactory {
    Button createButton();
    Window createWindow();
    Theme createTheme();
}
