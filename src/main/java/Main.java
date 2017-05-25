import java.time.Instant;

/**
 * @author hezhuofan
 */
public class Main {
    public static void main(String[] args) {
        Instant now     = Instant.now();

        Instant later   = now.plusSeconds(3);
        Instant earlier = now.minusSeconds(3);

        System.out.println(later);
        System.out.println(earlier);



    }
}
