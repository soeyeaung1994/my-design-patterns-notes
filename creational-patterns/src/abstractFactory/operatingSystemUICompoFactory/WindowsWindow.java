package abstractFactory.operatingSystemUICompoFactory;

import abstractFactory.operatingSystemUICompoFactory.interfaces.Window;

/**
 * @Author: Soe Ye Aung
 * @Date: 8/2/25
 * @Time: 9:43 am
 */
public class WindowsWindow implements Window {
    @Override
    public void show() {
        System.out.println("Showing window with Windows decorations");
    }

    @Override
    public void close() {
        System.out.println("Windows close animation");
    }
}
