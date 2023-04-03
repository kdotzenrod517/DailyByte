package math;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TimeDifference {

    public static void main(String[] args) {
        System.out.println(clockwork(List.of("01:00", "01:10"))); // return 10 (i.e. there are 10 minutes between the two times).
        System.out.println(clockwork(List.of("00:00", "12:23", "05:50", "23:12"))); // return 48
    }

    // Runtime: O(NlogN) where N is the total number of elements in times.
    // Space complexity: O(N) where N is the total number of elements in times.
    public static int clockwork(List<String> times) {
        int min = Integer.MAX_VALUE;
        List<Integer> minutes = new ArrayList();

        for (int i = 0; i < times.size(); i++) {
            int hours = Integer.valueOf(times.get(i).substring(0, 2));
            minutes.add(hours * 60 + Integer.valueOf(times.get(i).substring(3, 5)));
        }

        Collections.sort(minutes, (a, b) -> a - b);
        for (int i = 0; i < minutes.size() - 1; i++) {
            min = Math.min(min, minutes.get(i + 1) - minutes.get(i));
        }

        int firstAndLast = minutes.get(0) + (1440 - minutes.get(minutes.size() - 1));
        return Math.min(min, firstAndLast);
    }
}
