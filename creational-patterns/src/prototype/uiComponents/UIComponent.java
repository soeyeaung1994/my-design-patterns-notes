package prototype.uiComponents;

/**
 * @Author: Soe Ye Aung
 * @Date: 8/2/25
 * @Time: 12:05 pm
 */
public sealed interface UIComponent permits Button, Form, Dialog {
    UIComponent clone();
    void render();
    String getId();
}
