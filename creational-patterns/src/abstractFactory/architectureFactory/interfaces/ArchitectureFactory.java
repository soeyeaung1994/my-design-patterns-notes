package abstractFactory.architectureFactory.interfaces;

/**
 * @Author: Soe Ye Aung
 * @Date: 8/2/25
 * @Time: 10:50 am
 *
 * Abstract Factory
 *
 */

public interface ArchitectureFactory {
    Building createBuilding();
    Window createWindow();
    Door createDoor();
}
