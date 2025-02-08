package factory.fileFormatFactory;

/**
 * @Author: Soe Ye Aung
 * @Date: 7/2/25
 * @Time: 5:11 pm
 */
public class PdfDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening PDF document...");
    }

    @Override
    public void save() {
        System.out.println("Saving PDF document...");
    }

    @Override
    public void edit() {
        System.out.println("Editing PDF document...");
    }
}
