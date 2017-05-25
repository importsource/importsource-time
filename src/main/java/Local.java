import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

/**
 * @author hezhuofan
 */
public class Local {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();//now
        LocalDate date = LocalDate.of(2005, 5, 10);//customize
        LocalDate date2 = LocalDate.of(2003, Month.FEBRUARY, 5);
        System.out.println(now);
        System.out.println(date);
        System.out.println(date2);
        LocalTime now2 = LocalTime.now();//now
        LocalTime time = LocalTime.of(22, 50, 56);//customize
        System.out.println(now2);
        System.out.println(time);
    }
}
