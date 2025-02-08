package abstractFactory.hotelRoomFactory;

import abstractFactory.hotelRoomFactory.interfaces.Room;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Author: Soe Ye Aung
 * @Date: 8/2/25
 * @Time: 11:05 am
 *
 * Deluxe room products
 *
 */

public class DeluxeRoom implements Room {
    @Override
    public int getSize() {
        return 40; // စတုရန်းမီတာ
    }

    @Override
    public List<String> getAmenities() {
        return List.of(
                "King Size Bed",
                "Mini Bar",
                "42\" TV",
                "Free WiFi"
        );
    }

    @Override
    public BigDecimal getPrice() {
        return BigDecimal.valueOf(200000); // ကျပ်
    }
}
