package factory.uiComponentFactory;

/**
 * @Author: Soe Ye Aung
 * @Date: 7/2/25
 * @Time: 7:27 pm
 */
public record TextBox(String label, String style) implements UIComponent {

    @Override
    public void render() {

    }

    @Override
    public void handleEvent(String event) {

    }

    @Override
    public String getValue() {
        return "";
    }

    @Override
    public void setValue(String value) {

    }
}
