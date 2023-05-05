import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Date {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter date separated by slash: ");
        String inputDate = scanner.nextLine();
        SimpleDateFormat inputFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        SimpleDateFormat outputFormat = new SimpleDateFormat("EEE, d MMMM yyyy", Locale.ENGLISH);
        try {
            java.util.Date date = inputFormat.parse(inputDate);
            String outputDate = outputFormat.format(date);
            System.out.println(outputDate);
        } catch (ParseException exeption) {
            System.out.println("Error parsing date: " + exeption.getMessage());
        }
    }
}

