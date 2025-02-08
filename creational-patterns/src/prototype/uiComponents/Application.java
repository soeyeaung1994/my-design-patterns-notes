package prototype.uiComponents;

/**
 * @Author: Soe Ye Aung
 * @Date: 8/2/25
 * @Time: 12:05 pm
 */
public class Application {
    public static void main(String[] args) {
        Button originalBtn = new Button("btn1", "Click Me", "primary", () -> System.out.println("Clicked!"));
        Button clonedBtn = originalBtn.clone();
        System.out.println(STR."Original Btn: \{originalBtn}");
        System.out.println(STR."Cloned Btn: \{clonedBtn}");
    }
}
