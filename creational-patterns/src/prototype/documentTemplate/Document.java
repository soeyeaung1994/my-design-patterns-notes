package prototype.documentTemplate;

/**
 * @Author: Soe Ye Aung
 * @Date: 4/2/25
 * @Time: 11:20 pm
 */
public class Document implements Prototype {
    private String content;
    private String style;

    public Document(String content, String style) {
        this.content = content;
        this.style = style;
    }

    @Override
    public Document clone() {
        return new Document(this.content, this.style);
    }

    // Getters and setters
    public void setContent(String content) {
        this.content = content;
    }

    public static void main(String[] args) {
        // Usage
        Document template = new Document("Contract Template", "Legal");
        Document contract1 = template.clone();
        contract1.setContent("Contract for Client A");

        Document contract2 = template.clone();
        contract2.setContent("Contract for Client B");
    }
}
