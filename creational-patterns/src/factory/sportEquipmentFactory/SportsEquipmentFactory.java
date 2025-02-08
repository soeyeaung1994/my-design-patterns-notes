package factory.sportEquipmentFactory;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Author: Soe Ye Aung
 * @Date: 7/2/25
 * @Time: 7:14 pm
 */
public class SportsEquipmentFactory {
    public static SportsEquipment createEquipment(String type) {
        return switch (type.toLowerCase()) {
            case "football" -> new Ball(
                    "Football",
                    BigDecimal.valueOf(25000),
                    List.of("Size 5", "FIFA Approved", "Professional Match Ball")
            );
            case "tennis" -> new Ball(
                    "Tennis",
                    BigDecimal.valueOf(8000),
                    List.of("Professional Grade", "ITF Approved")
            );
            case "basketball" -> new Ball(
                    "Basketball",
                    BigDecimal.valueOf(35000),
                    List.of("Size 7", "Indoor/Outdoor", "Official NBA Size")
            );
            default -> throw new IllegalArgumentException("Unknown equipment: " + type);
        };
    }
}
