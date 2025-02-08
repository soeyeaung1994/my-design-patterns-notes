package prototype.configurationSettings;

import java.util.Map;

/**
 * @Author: Soe Ye Aung
 * @Date: 8/2/25
 * @Time: 12:23 pm
 */
public class Application {
    public static void main(String[] args) {
        AppConfig defaultConfig = new AppConfig();
        AppConfig darkModeConfig = defaultConfig.cloneWithOverrides(Map.of(
                "theme", "dark",
                "fontSize", 14
        ));
        System.out.println(STR."Default config: \{defaultConfig}");
        System.out.println(STR."Dark mode config: \{darkModeConfig}");
    }
}
