package Lists;

import java.util.ArrayList;
import java.util.List;

public class MergeIntervals {

    // Sort by start time
    // If current interval start time is LESS than or EQUAL to our end, there is overlap
    // If there is overlap, end time is max between current end time and current interval
    public static void main(String[] args) {
        mergeIntervals(new ArrayList<>(List.of(new Interval(1, 3), new Interval(1, 8))))
                .forEach(interval -> System.out.print("[" + interval.start + "," + " " + interval.end + "]")); // [[1, 8]]
        System.out.println();
        mergeIntervals(new ArrayList<>(List.of(new Interval(1, 2), new Interval(2, 6), new Interval(7, 10))))
                .forEach(interval -> System.out.print("[" + interval.start + "," + " " + interval.end + "]")); // [[1, 6], [7, 10]]
    }

    // Runtime: O(NlogN) where N is the total number of intervals we’re given.
    // Space complexity: O(N) where N is the total number of intervals we’re given.
    public static List<Interval> mergeIntervals(ArrayList<Interval> intervals) {

        if(intervals == null || intervals.size() < 2) return intervals;
        List<Interval> response = new ArrayList<>();

        intervals.sort((a, b) -> a.start - b.start);

        int start = intervals.get(0).start;
        int end = intervals.get(0).end;

        for(Interval i : intervals){
            if(i.start <= end){
                end = Math.max(end, i.end);
            } else {
                response.add(new Interval(start, end));
                start = i.start;
                end = i.end;
            }
        }

        response.add(new Interval(start, end));
        return response;
    }

    public static class Interval {
        int start;
        int end;

        Interval() {
            start = 0;
            end = 0;
        }

        Interval(int s, int e) {
            start = s;
            end = e;
        }
    }


}
