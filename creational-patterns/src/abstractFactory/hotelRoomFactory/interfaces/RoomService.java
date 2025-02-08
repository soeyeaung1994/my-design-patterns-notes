package abstractFactory.hotelRoomFactory.interfaces;

import java.time.Duration;
import java.util.List;

/**
 * @Author: Soe Ye Aung
 * @Date: 8/2/25
 * @Time: 11:04 am
 */
public interface RoomService {
    List<String> getMenu();
    Duration getServiceTime();
}
