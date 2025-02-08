package abstractFactory.operatingSystemUICompoFactory;

import abstractFactory.operatingSystemUICompoFactory.interfaces.Button;
import abstractFactory.operatingSystemUICompoFactory.interfaces.Theme;
import abstractFactory.operatingSystemUICompoFactory.interfaces.UIFactory;
import abstractFactory.operatingSystemUICompoFactory.interfaces.Window;

/**
 * @Author: Soe Ye Aung
 * @Date: 8/2/25
 * @Time: 10:22 am
 */
// Concrete Factories
public class WindowsUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Window createWindow() {
        return new WindowsWindow();
    }

    @Override
    public Theme createTheme() {
        return new WindowsTheme();
    }
}
