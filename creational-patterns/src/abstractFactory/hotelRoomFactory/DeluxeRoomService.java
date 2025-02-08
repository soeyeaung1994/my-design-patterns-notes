package abstractFactory.hotelRoomFactory;

import abstractFactory.hotelRoomFactory.interfaces.RoomService;

import java.time.Duration;
import java.util.List;

/**
 * @Author: Soe Ye Aung
 * @Date: 8/2/25
 * @Time: 11:16 am
 */
public class DeluxeRoomService implements RoomService {
    @Override
    public List<String> getMenu() {
        return List.of();
    }

    @Override
    public Duration getServiceTime() {
        return null;
    }
}
