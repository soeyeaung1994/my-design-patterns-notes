package prototype.gameObjects;

/**
 * @Author: Soe Ye Aung
 * @Date: 8/2/25
 * @Time: 11:59 am
 */
public interface GameObject extends Cloneable {
    GameObject clone();
    void render();
    void update();
}
