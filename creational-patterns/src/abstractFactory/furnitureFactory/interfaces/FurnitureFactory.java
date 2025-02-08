package abstractFactory.furnitureFactory.interfaces;

/**
 * @Author: Soe Ye Aung
 * @Date: 4/2/25
 * @Time: 11:15 pm
 *
 * Abstract factory
 *
 */

public interface FurnitureFactory {
    Chair createChair();
    Table createTable();
}
