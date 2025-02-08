package singleton;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Soe Ye Aung
 * @Date: 5/2/25
 * @Time: 10:41 am
 */
public final class WindowManager {
    private static final WindowManager INSTANCE = new WindowManager();
    private final List<Window> windows;

    private WindowManager() {
        windows = new ArrayList<>();
    }

    public static WindowManager getInstance() {
        return INSTANCE;
    }

    public void createWindow(String title) {
        Window window = new Window(title);
        windows.add(window);
    }

    public void closeWindow(Window window) {
        windows.remove(window);
    }

    public record Window(String title) {
        // Window properties and methods
    }
}
