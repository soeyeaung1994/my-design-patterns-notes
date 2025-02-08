package prototype.gameObjects;

/**
 * @Author: Soe Ye Aung
 * @Date: 8/2/25
 * @Time: 12:00 pm
 */
public class Application {
    public static void main(String[] args) {
        // Usage
        Enemy boss = new Enemy(100, 20, new Vector2D(0, 0), "Boss");
        Enemy miniBoss = boss.clone();
        miniBoss.setHealth(50);
    }
}
