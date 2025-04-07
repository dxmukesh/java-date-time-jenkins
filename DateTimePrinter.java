import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimePrinter {
    public static void main(String[] args) {
        // Get current system date and time
        LocalDateTime now = LocalDateTime.now();

        // Format it nicely
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // Print to console
        System.out.println("Current Date and Time: " + now.format(formatter));
    }
}
