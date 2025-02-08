package singleton;

import java.time.Duration;
import java.time.Instant;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: Soe Ye Aung
 * @Date: 5/2/25
 * @Time: 1:41 pm
 */

public final class CacheManager {
    private static final CacheManager INSTANCE = new CacheManager();
    private final Map<String, CacheEntry> cache;

    private CacheManager() {
        cache = new ConcurrentHashMap<>();
    }

    public static CacheManager getInstance() {
        return INSTANCE;
    }

    public void put(String key, Object value, Duration ttl) {
        cache.put(key, new CacheEntry(value, Instant.now().plus(ttl)));
    }

    public Optional<Object> get(String key) {
        CacheEntry entry = cache.get(key);
        if (entry != null && !entry.isExpired()) {
            return Optional.of(entry.value());
        }
        cache.remove(key); // Remove expired entry
        return Optional.empty();
    }

    private record CacheEntry(Object value, Instant expiryTime) {
        boolean isExpired() {
            return Instant.now().isAfter(expiryTime);
        }
    }
}
