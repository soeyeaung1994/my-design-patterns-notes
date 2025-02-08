package factory.transportServiceFactory;

import java.math.BigDecimal;
import java.time.Duration;

/**
 * @Author: Soe Ye Aung
 * @Date: 7/2/25
 * @Time: 7:09 pm
 */
public class SeaTransport implements TransportService {
    @Override
    public void calculateRoute(String from, String to) {

    }

    @Override
    public BigDecimal calculateCost(double distance) {
        return null;
    }

    @Override
    public Duration estimateTime(double distance) {
        return null;
    }
}
