package abstractFactory.furnitureFactory;

import abstractFactory.furnitureFactory.interfaces.Chair;

/**
 * @Author: Soe Ye Aung
 * @Date: 4/2/25
 * @Time: 11:14 pm
 *
 * Concrete products for Modern style
 *
 */

public class ModernChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on modern chair");
    }
}
