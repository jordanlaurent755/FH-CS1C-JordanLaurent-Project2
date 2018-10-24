//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package cs1c;

import java.util.concurrent.TimeUnit;

public class TimeConverter {
    public TimeConverter() {
    }

    public static String convertTimeToString(int time) {
        int hours = time / 60 / 60;
        int minutes = time / 60;
        int seconds = time % 60;
        return hours + ":" + minutes + ":" + seconds;
    }

    public static String convertTimeToString(long nanos) {
        if (nanos < 0L) {
            throw new IllegalArgumentException("ERROR : Duration is less than zero!");
        } else {
            long hours = TimeUnit.NANOSECONDS.toHours(nanos);
            nanos -= TimeUnit.HOURS.toNanos(hours);
            long minutes = TimeUnit.NANOSECONDS.toMinutes(nanos);
            nanos -= TimeUnit.MINUTES.toNanos(minutes);
            long seconds = TimeUnit.NANOSECONDS.toSeconds(nanos);
            nanos -= TimeUnit.SECONDS.toNanos(seconds);
            long milliseconds = TimeUnit.NANOSECONDS.toMillis(nanos);
            nanos -= TimeUnit.MILLISECONDS.toNanos(milliseconds);
            StringBuilder sb = new StringBuilder(64);
            sb.append(hours);
            sb.append(" hrs : ");
            sb.append(minutes);
            sb.append(" mins : ");
            sb.append(seconds);
            sb.append(" sec : ");
            sb.append(milliseconds);
            sb.append(" ms : ");
            sb.append(nanos);
            sb.append(" ns");
            return sb.toString();
        }
    }
}
