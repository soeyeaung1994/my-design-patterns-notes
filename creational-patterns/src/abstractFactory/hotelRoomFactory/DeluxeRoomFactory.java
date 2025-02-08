package abstractFactory.hotelRoomFactory;

import abstractFactory.hotelRoomFactory.interfaces.Bathroom;
import abstractFactory.hotelRoomFactory.interfaces.HotelRoomFactory;
import abstractFactory.hotelRoomFactory.interfaces.Room;
import abstractFactory.hotelRoomFactory.interfaces.RoomService;

/**
 * @Author: Soe Ye Aung
 * @Date: 8/2/25
 * @Time: 11:13 am
 */
// Concrete Factory
public class DeluxeRoomFactory implements HotelRoomFactory {
    @Override
    public Room createRoom() {
        return new DeluxeRoom();
    }

    @Override
    public RoomService createRoomService() {
        return new DeluxeRoomService();
    }

    @Override
    public Bathroom createBathroom() {
        return new DeluxeBathroom();
    }
}
