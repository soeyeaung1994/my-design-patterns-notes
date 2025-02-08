package factory.uiComponentFactory;

import java.util.Map;

/**
 * @Author: Soe Ye Aung
 * @Date: 7/2/25
 * @Time: 7:27 pm
 */
public class UIComponentFactory {
    public static UIComponent createComponent(String type, Map<String, String> props) {
        return switch (type.toLowerCase()) {
            case "button" -> new Button(props.get("label"), props.get("style"));
            case "textbox" -> new TextBox(props.get("placeholder"), props.get("type"));
            case "checkbox" -> new Checkbox(props.get("label"), Boolean.parseBoolean(props.get("checked")));
            default -> throw new IllegalArgumentException(STR."Unknown component type: \{type}");
        };
    }
}
