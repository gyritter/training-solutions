package x.canoe;
import java.time.Duration;
import java.time.LocalDateTime;

import java.time.LocalDateTime;

public class BetweenTest {
    public BetweenTest() {
    }

    public static void main(String[] args) {
        LocalDateTime t1 =LocalDateTime.of(2021, 01, 22, 15, 12);
        LocalDateTime t2 =LocalDateTime.of(2021, 01, 22, 16, 12);
        Duration d =Duration.between(t1, t2);

        System.out.println(d);
        System.out.println((d.toMinutes()+59)/60);
    }
}
