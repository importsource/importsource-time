import java.time.Duration;
import java.time.Instant;

/**
 * @author hezhuofan
 */
public class Comparation {
    public static void main(String[] args) {
        Instant start = Instant.now();
        doSomething();
        Instant end = Instant.now();
        Duration time = Duration.between(start, end);

        Instant start2 = Instant.now();
        doSomething2();
        Instant end2 = Instant.now();
        Duration time2 = Duration.between(start2, end2);
        boolean fast = time.minus(time2).isNegative();
        System.out.println(fast);
    }

    private static void doSomething2() {
        try {
            Thread.sleep(3000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void doSomething() {
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
