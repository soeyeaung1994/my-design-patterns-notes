package factory.vehicleFactory;

/**
 * @Author: Soe Ye Aung
 * @Date: 4/2/25
 * @Time: 9:20 pm
 */
// Factory class
public class VehicleFactory {
    public Vehicle createVehicle(String type) {
        return switch (type.toLowerCase()) {
            case "sedan" -> new Sedan();
            case "suv" -> new SUV();
            default -> throw new IllegalArgumentException("Unknown vehicle type");
        };
    }
}
