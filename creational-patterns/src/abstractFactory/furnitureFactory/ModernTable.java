package abstractFactory.furnitureFactory;

import abstractFactory.furnitureFactory.interfaces.Table;

/**
 * @Author: Soe Ye Aung
 * @Date: 4/2/25
 * @Time: 11:15 m
 */
public class ModernTable implements Table {
    @Override
    public void putOn() {
        System.out.println("Putting on modern table");
    }
}
