package abstractFactory.furnitureFactory;

import abstractFactory.furnitureFactory.interfaces.Chair;
import abstractFactory.furnitureFactory.interfaces.FurnitureFactory;
import abstractFactory.furnitureFactory.interfaces.Table;

/**
 * @Author: Soe Ye Aung
 * @Date: 4/2/25
 * @Time: 11:16 pm
 *
 * Concrete factory
 *
 */

public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }
}
