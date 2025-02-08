package abstractFactory.operatingSystemUICompoFactory;

import abstractFactory.operatingSystemUICompoFactory.interfaces.Button;
import abstractFactory.operatingSystemUICompoFactory.interfaces.Theme;
import abstractFactory.operatingSystemUICompoFactory.interfaces.UIFactory;
import abstractFactory.operatingSystemUICompoFactory.interfaces.Window;

/**
 * @Author: Soe Ye Aung
 * @Date: 8/2/25
 * @Time: 10:31 am
 *
 * Client usage
 *
 */

public class Application {
    private final UIFactory factory;

    public Application(UIFactory factory) {
        this.factory = factory;
    }

    public void createUI() {
        Button button = factory.createButton();
        Window window = factory.createWindow();
        Theme theme = factory.createTheme();

        button.render();
        window.show();
    }
}
