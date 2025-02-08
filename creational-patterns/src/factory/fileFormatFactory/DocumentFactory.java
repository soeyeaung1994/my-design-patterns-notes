package factory.fileFormatFactory;

/**
 * @Author: Soe Ye Aung
 * @Date: 7/2/25
 * @Time: 5:13 pm
 */
public class DocumentFactory {
    public static Document createDocument(String type, String filePath) {
        return switch (type.toLowerCase()) {
            case "pdf" -> new PdfDocument();
            case "word" -> new WordDocument();
            case "excel" -> new ExcelDocument();
            default -> throw new IllegalArgumentException("Unsupported document type: " + type);
        };
    }
}
