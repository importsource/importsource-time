import java.time.Duration;
import java.time.Instant;

/**
 * @author hezhuofan
 */
public class NowBetween {
    public static void main(String[] args) {
        Instant start = Instant.now();
        doSomething();
        Instant end = Instant.now();
        Duration time = Duration.between(start, end);
        long seconds = time.getSeconds();//秒表示
        long millis = time.toMillis();//毫秒表示
        System.out.println(seconds);
        System.out.println(millis);
    }

    private static void doSomething() {
        System.out.println("do something...");
    }
}
