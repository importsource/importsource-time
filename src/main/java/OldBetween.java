import java.time.Duration;
import java.time.Instant;

/**
 * @author hezhuofan
 */
public class OldBetween {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        doSomething();
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }

    private static void doSomething() {
        System.out.println("do something...");
    }
}
