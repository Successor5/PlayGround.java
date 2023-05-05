    import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.text.ParseException;

    public class DateConverter {
        public static void main(String[] args) {
            String inputDate = "17/04/2023";
            SimpleDateFormat inputFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
            SimpleDateFormat outputFormat = new SimpleDateFormat("EEEE, d MMMM yyyy", Locale.ENGLISH);

            try {
                Date date = inputFormat.parse(inputDate);
                String outputDate = outputFormat.format(date);
                System.out.println(outputDate);
            } catch (ParseException e) {
                System.out.println("Error parsing date: " + e.getMessage());
            }
        }
    }

