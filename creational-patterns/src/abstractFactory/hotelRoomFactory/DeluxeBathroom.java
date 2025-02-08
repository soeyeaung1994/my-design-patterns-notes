package abstractFactory.hotelRoomFactory;

import abstractFactory.hotelRoomFactory.interfaces.Bathroom;

/**
 * @Author: Soe Ye Aung
 * @Date: 8/2/25
 * @Time: 11:16 am
 */
public class DeluxeBathroom implements Bathroom {
    @Override
    public boolean hasShower() {
        return false;
    }

    @Override
    public boolean hasBathtub() {
        return false;
    }
}
