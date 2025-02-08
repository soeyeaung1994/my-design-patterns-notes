package prototype.uiComponents;


/**
 * @Author: Soe Ye Aung
 * @Date: 8/2/25
 * @Time: 12:05 pm
 */
public final class Button implements UIComponent {
    private String id;
    private String label;
    private String style;
    private EventHandler clickHandler;

    public Button(String id, String label, String style, EventHandler clickHandler) {
        this.id = id;
        this.label = label;
        this.style = style;
        this.clickHandler = clickHandler;
    }

    @Override
    public String toString() {
        return STR."Button{id='\{id}', label='\{label}', style='\{style}', clickHandler=\{clickHandler}}";
    }

    @Override
    public Button clone() {
        return new Button(
                STR."\{id}_copy",
                this.label,
                this.style,
                this.clickHandler
        );
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void render() {
        System.out.println(STR."Rendering button: \{label}");
    }
}
