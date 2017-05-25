import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * @author hezhuofan
 */
public class DateFormat {
    public static void main(String[] args) {
        //按照内置的不同方式格式化
        String format = DateTimeFormatter.ISO_LOCAL_DATE.format(LocalDate.now());
        String format2 = DateTimeFormatter.ISO_LOCAL_TIME.format(LocalTime.now());
        String format3 = DateTimeFormatter.ISO_DATE.format(LocalDateTime.now());
        String format4 = DateTimeFormatter.ISO_INSTANT.format(Instant.now());
        System.out.println(format);
        System.out.println(format2);
        System.out.println(format3);
        System.out.println(format4);
        //按照标准格式格式化
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        String format5 = formatter.format(LocalDateTime.now());
        System.out.println(format5);
        //按照指定方式格式化
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy-MM-dd E HH:mm:ss");
        String format6 = pattern.format(LocalDateTime.now());
        System.out.println(format6);
    }
}
