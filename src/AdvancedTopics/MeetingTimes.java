package AdvancedTopics;

import java.util.Arrays;

public class MeetingTimes {

    public static void main(String[] args){
        System.out.println(meetings(new Interval[]{new Interval(1, 3), new Interval(5, 10)})); // true
        System.out.println(meetings(new Interval[]{new Interval(1, 8), new Interval(5, 9)})); // false
    }

    // Iterate through our start times checking if the next start time is less than the current end time.
    // If it is, then that means that two meetings overlap, and we can return false since someone would
    // not be able to attend all the meetings.

    // Runtime: O(N) where N is the total number of intervals we’re given.
    // Space complexity: O(N) where N is the total number of intervals we’re given.
    public static boolean meetings(Interval[] meetings){

        int[] startTimes = new int[meetings.length];
        int[] endTimes = new int[meetings.length];

        for(int i = 0; i < meetings.length; i++){
            startTimes[i] = meetings[i].start;
            endTimes[i] = meetings[i].end;
        }

        Arrays.sort(startTimes);
        Arrays.sort(endTimes);


        for(int i = 0; i < startTimes.length - 1; i++){
            if(startTimes[i + 1] > endTimes[i]){
                return false;
            }
        }

        return true;
    }
}

