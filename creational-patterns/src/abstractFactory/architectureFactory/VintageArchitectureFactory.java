package abstractFactory.architectureFactory;

import abstractFactory.architectureFactory.interfaces.ArchitectureFactory;
import abstractFactory.architectureFactory.interfaces.Building;
import abstractFactory.architectureFactory.interfaces.Door;
import abstractFactory.architectureFactory.interfaces.Window;

/**
 * @Author: Soe Ye Aung
 * @Date: 8/2/25
 * @Time: 10:54 am
 */
// Concrete Factory
public class VintageArchitectureFactory implements ArchitectureFactory {
    @Override
    public Building createBuilding() {
        return new VintageBuilding();
    }

    @Override
    public Window createWindow() {
        return new VintageWindow();
    }

    @Override
    public Door createDoor() {
        return new VintageDoor();
    }
}
