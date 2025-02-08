package abstractFactory.architectureFactory.interfaces;

/**
 * @Author: Soe Ye Aung
 * @Date: 8/2/25
 * @Time: 10:49 am
 */
public interface Building {
    void design();
    record Dimensions(int width, int height, int length) {}
}
