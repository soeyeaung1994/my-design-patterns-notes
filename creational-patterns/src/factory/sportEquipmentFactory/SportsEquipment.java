package factory.sportEquipmentFactory;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Author: Soe Ye Aung
 * @Date: 7/2/25
 * @Time: 7:13 pm
 */
public interface SportsEquipment {
    String getType();
    BigDecimal getPrice();
    List<String> getSpecifications();
}
