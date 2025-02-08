package singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @Author: Soe Ye Aung
 * @Date: 8/2/25
 * @Time: 12:44 pm
 */

public class DatabaseConnection {
    private static volatile DatabaseConnection instance;
    private Connection connection;

    // Constructor return type မသုံးဘဲ private only. constructor ကို private ထားလိုက်တာက တခြားနေရာတွေကနေ new နဲ့ create မလုပ်နိုင်အောင်ပါ
    private DatabaseConnection() {
        try {
            String url = "jdbc:mysql://localhost:3306/your_database";
            String user = "your_username";
            String password = "your_password";

            // Properly initialize the connection
            connection = DriverManager.getConnection(url, user, password);

        } catch (SQLException e) {
            throw new RuntimeException("Database Connection Failed!", e);
        }
    }

    // Double-Checked Locking Singleton (Thread-Safe). instance တစ်ခုပဲရအောင် static method နဲ့ထိန်းထားပါတယ်
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            synchronized (DatabaseConnection.class) {
                if (instance == null) {
                    instance = new DatabaseConnection();
                }
            }
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }

    public static void main(String[] args) {
        DatabaseConnection db = DatabaseConnection.getInstance();
        System.out.println(STR."Database Connected: \{db.getConnection() != null}");
    }
}

