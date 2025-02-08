package factory.uiComponentFactory;

/**
 * @Author: Soe Ye Aung
 * @Date: 7/2/25
 * @Time: 7:26 pm
 */
public interface UIComponent {
    void render();
    void handleEvent(String event);
    String getValue();
    void setValue(String value);
}
