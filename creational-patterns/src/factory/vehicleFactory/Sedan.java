package factory.vehicleFactory;

/**
 * @Author: Soe Ye Aung
 * @Date: 4/2/25
 * @Time: 9:19 pm
 */
// Concrete vehicle classes
public class Sedan implements Vehicle {
    @Override
    public void start() {
        System.out.println("Sedan starting...");
    }

    @Override
    public void stop() {
        System.out.println("Sedan stopping...");
    }
}
