package abstractFactory.hotelRoomFactory.interfaces;

/**
 * @Author: Soe Ye Aung
 * @Date: 8/2/25
 * @Time: 11:12 am
 *
 * Abstract Factory
 *
 */

public interface HotelRoomFactory {
    Room createRoom();
    RoomService createRoomService();
    Bathroom createBathroom();
}
