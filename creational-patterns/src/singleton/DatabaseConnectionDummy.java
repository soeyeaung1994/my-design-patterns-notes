package singleton;

import java.sql.Connection;

public class DatabaseConnectionDummy {
    private static DatabaseConnectionDummy instance;
    private Connection connection;

    // constructor ကို private ထားလိုက်တာက တခြားနေရာတွေကနေ new နဲ့ create မလုပ်နိုင်အောင်ပါ
    DatabaseConnectionDummy() {
        // database connection logic
    }

    // instance တစ်ခုပဲရအောင် static method နဲ့ထိန်းထားပါတယ်
    public static synchronized DatabaseConnectionDummy getInstance() {
        if (instance == null) {
            instance = new DatabaseConnectionDummy();
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }

    public static void main(String[] args) {
        DatabaseConnectionDummy db = DatabaseConnectionDummy.getInstance();
        db.getConnection();
    }
}

