package prototype.gameObjects;

/**
 * @Author: Soe Ye Aung
 * @Date: 8/2/25
 * @Time: 12:00 pm
 */
public class Enemy implements GameObject {
    private int health;
    private int damage;
    private Vector2D position;
    private String type;

    public Enemy(int health, int damage, Vector2D position, String type) {
        this.health = health;
        this.damage = damage;
        this.position = position;
        this.type = type;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setPosition(Vector2D position) {
        this.position = position;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public Enemy clone() {
        return new Enemy(
                this.health,
                this.damage,
                new Vector2D(this.position.x(), this.position.y()),
                this.type
        );
    }

    @Override
    public void render() {
        System.out.println(STR."Rendering \{type} at position \{position}");
    }

    @Override
    public void update() {
        // Update logic
    }
}
