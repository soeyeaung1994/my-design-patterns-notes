package factory.transportServiceFactory;

/**
 * @Author: Soe Ye Aung
 * @Date: 7/2/25
 * @Time: 7:08 pm
 */
public class TransportFactory {
    public static TransportService createTransportService(String type) {
        return switch (type.toLowerCase()) {
            case "road" -> new RoadTransport();
            case "sea" -> new SeaTransport();
            case "air" -> new AirTransport();
            default -> throw new IllegalArgumentException("Unknown transport type: " + type);
        };
    }
}
