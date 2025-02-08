package abstractFactory.operatingSystemUICompoFactory;

import abstractFactory.operatingSystemUICompoFactory.interfaces.Theme;

/**
 * @Author: Soe Ye Aung
 * @Date: 8/2/25
 * @Time: 10:24 am
 */
public class WindowsTheme implements Theme {
    @Override
    public String getColorScheme() {
        return "Change to Darcula Theme.";
    }
}
