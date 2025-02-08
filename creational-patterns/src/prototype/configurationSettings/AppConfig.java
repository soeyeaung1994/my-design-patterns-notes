package prototype.configurationSettings;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Soe Ye Aung
 * @Date: 8/2/25
 * @Time: 12:19 pm
 */
public class AppConfig implements Cloneable {
    private final Map<String, Object> settings;

    public AppConfig() {
        this.settings = new HashMap<>();
        loadDefaultSettings();
    }

    private AppConfig(Map<String, Object> settings) {
        this.settings = new HashMap<>(settings);
    }

    private void loadDefaultSettings() {
        settings.put("theme", "light");
        settings.put("fontSize", 12);
        settings.put("language", "my");
        settings.put("notifications", true);
    }

    @Override
    public String toString() {
        return STR."AppConfig{settings=\{settings}}";
    }

    @Override
    public AppConfig clone() {
        return new AppConfig(this.settings);
    }

    public AppConfig cloneWithOverrides(Map<String, Object> overrides) {
        AppConfig clone = this.clone();
        clone.settings.putAll(overrides);
        return clone;
    }

    public Object getSetting(String key) {
        return settings.get(key);
    }
}
