package factory.transportServiceFactory;

import java.math.BigDecimal;
import java.time.Duration;

/**
 * @Author: Soe Ye Aung
 * @Date: 7/2/25
 * @Time: 7:05 pm
 */
public interface TransportService {
    void calculateRoute(String from, String to);
    BigDecimal calculateCost(double distance);
    Duration estimateTime(double distance);
}
