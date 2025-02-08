package abstractFactory.hotelRoomFactory.interfaces;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Author: Soe Ye Aung
 * @Date: 8/2/25
 * @Time: 11:04 am
 */
public interface Room {
    int getSize();
    List<String> getAmenities();
    BigDecimal getPrice();
}
