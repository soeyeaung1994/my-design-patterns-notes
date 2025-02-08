package prototype.databaseRecords;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Soe Ye Aung
 * @Date: 8/2/25
 * @Time: 12:15 pm
 */
public class DatabaseRecord implements Cloneable {
    private Long id;
    private Map<String, Object> fields;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public DatabaseRecord(Map<String, Object> fields) {
        this.fields = new HashMap<>(fields);
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Map<String, Object> getFields() {
        return fields;
    }

    public void setFields(Map<String, Object> fields) {
        this.fields = fields;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return STR."DatabaseRecord{id=\{id}, fields=\{fields}, createdAt=\{createdAt}, updatedAt=\{updatedAt}}";
    }

    @Override
    public DatabaseRecord clone() {
        DatabaseRecord clone = new DatabaseRecord(new HashMap<>(this.fields));
        clone.setUpdatedAt(LocalDateTime.now());
        // ID ကို null ထားလိုက်တာက record အသစ်မှာ ID အသစ်ရအောင်ပါ
        clone.setId(null);
        return clone;
    }

}
