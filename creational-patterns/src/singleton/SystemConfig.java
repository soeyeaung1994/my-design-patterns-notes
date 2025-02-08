package singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: Soe Ye Aung
 * @Date: 5/2/25
 * @Time: 10:07 am
 */
public final class SystemConfig {
    private static final SystemConfig INSTANCE = new SystemConfig();
    private final Map<String, String> settings;

    private SystemConfig() {
        settings = new ConcurrentHashMap<>();
        loadSettings();
    }

    public static SystemConfig getInstance() {
        return INSTANCE;
    }

    private void loadSettings() {
        // Setting တွေကို file ကနေ load လုပ်
        settings.put("theme", "dark");
        settings.put("language", "my");
    }

    public String getSetting(String key) {
        return settings.get(key);
    }

    public void setSetting(String key, String value) {
        settings.put(key, value);
        saveSettings(); // Setting တွေကို persistent storage မှာ သိမ်း
    }

    private void saveSettings(){
        // Setting တွေကို persistent storage မှာ သိမ်း
    }
}
