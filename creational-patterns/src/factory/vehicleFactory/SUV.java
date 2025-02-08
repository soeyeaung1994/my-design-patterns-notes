package factory.vehicleFactory;

/**
 * @Author: Soe Ye Aung
 * @Date: 4/2/25
 * @Time: 9:19 pm
 */
public class SUV implements Vehicle {
    @Override
    public void start() {
        System.out.println("SUV starting...");
    }

    @Override
    public void stop() {
        System.out.println("SUV stopping...");
    }
}
