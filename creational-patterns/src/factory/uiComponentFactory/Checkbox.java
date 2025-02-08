package factory.uiComponentFactory;

/**
 * @Author: Soe Ye Aung
 * @Date: 7/2/25
 * @Time: 7:29 pm
 */
public record Checkbox(String label, boolean checked) implements UIComponent {
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
