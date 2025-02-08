package factory.transportServiceFactory;

import java.math.BigDecimal;
import java.time.Duration;

/**
 * @Author: Soe Ye Aung
 * @Date: 7/2/25
 * @Time: 7:07 pm
 *
 *  ရေလမ်း (SeaTransport) နဲ့ လေကြောင်း (AirTransport) အတွက်လည်း ဒီလိုပဲရေးမှာပါ
 *
 */
public class RoadTransport implements TransportService {
    @Override
    public void calculateRoute(String from, String to) {
        System.out.println(STR."Calculating road route from \{from} to \{to}");
    }

    @Override
    public BigDecimal calculateCost(double distance) {
        return BigDecimal.valueOf(distance * 1000); // ကီလိုမီတာ တစ်ခုကို ၁၀၀၀ ကျပ်
    }

    @Override
    public Duration estimateTime(double distance) {
        return Duration.ofHours((long) (distance / 60)); // နာရီနဲ့တွက်တာ
    }
}
