package factory.sportEquipmentFactory;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Author: Soe Ye Aung
 * @Date: 7/2/25
 * @Time: 7:14 pm
 */
public record Ball(String type, BigDecimal price, List<String> specs) implements SportsEquipment {
    @Override
    public String getType() {
        return type;
    }

    @Override
    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public List<String> getSpecifications() {
        return specs;
    }
}
