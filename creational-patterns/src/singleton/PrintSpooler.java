package singleton;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * @Author: Soe Ye Aung
 * @Date: 5/2/25
 * @Time: 10:40 am
 */
public final class PrintSpooler {
    private static final PrintSpooler INSTANCE = new PrintSpooler();
    private final Queue<PrintJob> printQueue;

    private PrintSpooler() {
        printQueue = new ConcurrentLinkedQueue<>();
        initializePrinter();
    }

    public static PrintSpooler getInstance() {
        return INSTANCE;
    }

    private void initializePrinter() {
        // Printer initialization logic
    }

    public void addPrintJob(PrintJob job) {
        printQueue.offer(job);
        processPrintQueue();
    }

    private void processPrintQueue() {
        PrintJob job = printQueue.poll();
        if (job != null) {
            // Print job ကို process လုပ်
            System.out.println("Printing: " + job.getDocumentName());
        }
    }

    public record PrintJob(String documentName, int pages) {
        public String getDocumentName() {
            return documentName;
        }
    }
}
