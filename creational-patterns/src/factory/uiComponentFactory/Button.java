package factory.uiComponentFactory;

/**
 * @Author: Soe Ye Aung
 * @Date: 7/2/25
 * @Time: 7:26 pm
 *
 * TextBox နဲ့ Checkbox တွေအတွက်လည်း ဒီလိုပဲရေးမှာပါ
 *
 */
public record Button(String label, String style) implements UIComponent {
    @Override
    public void render() {
        System.out.println(STR."Rendering button: \{label} with style: \{style}");
    }

    @Override
    public void handleEvent(String event) {
        System.out.println(STR."Button \{label} handling event: \{event}");
    }

    @Override
    public String getValue() {
        return label;
    }

    @Override
    public void setValue(String value) {
        // Buttons typically don't have settable values
    }
}
