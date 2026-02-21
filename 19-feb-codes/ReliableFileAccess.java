import java.io.*;

public class ReliableFileAccess {
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("missing_log.txt")) {
            System.out.println("I/O operation completed successfully.");
        } catch (IOException e) {
            System.out.println("An I/O error occurred.");
        }
    }
}