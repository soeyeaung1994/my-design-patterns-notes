package abstractFactory.operatingSystemUICompoFactory;

import abstractFactory.operatingSystemUICompoFactory.interfaces.Button;

/**
 * @Author: Soe Ye Aung
 * @Date: 8/2/25
 * @Time: 9:41 am
 *
 * Concrete Products for Windows
 *
 */
public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering Windows style button");
    }

    @Override
    public void handleClick() {
        System.out.println("Windows button click sound");
    }
}
