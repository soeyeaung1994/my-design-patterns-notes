package prototype.databaseRecords;

import java.util.Map;

/**
 * @Author: Soe Ye Aung
 * @Date: 8/2/25
 * @Time: 12:16 pm
 */
public class Application {
    public static void main(String[] args) {
        var record = new DatabaseRecord(Map.of(
                "name", "Product A",
                "price", 1000,
                "quantity", 50
        ));
        var duplicateRecord = record.clone();
        System.out.println(STR."Record: \{record}");
        System.out.println(STR."duplicateRecord: \{duplicateRecord}");
    }
}
