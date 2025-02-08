package singleton;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;

/**
 * @Author: Soe Ye Aung
 * @Date: 5/2/25
 * @Time: 1:36 pm
 */
public final class Logger {
    private static final Logger INSTANCE = new Logger();
    private static final String LOG_FILE = "application.log";

    private Logger() {
        // Initialize logger
    }

    public static Logger getInstance() {
        return INSTANCE;
    }

    public void log(String level, String message) {
        String logMessage = STR."""
            [\{level}] \{LocalDateTime.now()}: \{message}
            """;

        // Log to file
        try (BufferedWriter writer = Files.newBufferedWriter(
                Path.of(LOG_FILE),
                StandardOpenOption.APPEND,
                StandardOpenOption.CREATE)) {
            writer.write(logMessage);
        } catch (IOException e) {
            System.err.println("Failed to write log: " + e.getMessage());
        }
    }
}
