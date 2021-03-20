package general.traiding;

import static java.time.temporal.ChronoUnit.SECONDS;

import java.time.Duration;
import java.time.Instant;


public class TimestampsWithinRange {
    public static void main(String[] args) {
        Instant t1 = Instant.ofEpochSecond(1537797757);
        Instant t2 = Instant.ofEpochSecond(1537797757);

        System.out.println(areTimestampsWithinRange(t1, t2, 2));
        System.out.println(areTimestampsWithinRange2(t1, t2, 2));
        System.out.println(areTimestampsWithinRange3(t1, t2, 2));

    }

    public static Boolean areTimestampsWithinRange(Instant timestamp1, Instant timestamp2, int interval) {

        if (interval < 0) {
            return false;
        }

        Duration duration = Duration.between(timestamp1, timestamp2);
        long secondsBetween = duration.abs().getSeconds();

        return secondsBetween >= interval;
    }

    public static Boolean areTimestampsWithinRange2(Instant timestamp1, Instant timestamp2, int interval) {

        if (interval < 0) return false;

        return Math.abs(SECONDS.between(timestamp1, timestamp2)) >= interval;
    }

    public static Boolean areTimestampsWithinRange3(Instant timestamp1, Instant timestamp2, int interval) {

        if (interval < 0) return false;

        Duration betweenInterval = Duration.between(timestamp1, timestamp2);

        return betweenInterval.abs().getSeconds() >= interval;
    }
}
