package AdvancedTopics;

public class ClockAngle {

    public static void main(String[] args) {
        System.out.println(clockAngle(12, 0)); // return 0 (the hands are on top of each other).
        System.out.println(clockAngle(3, 25)); // return 47.5.
    }

    // Runtime: O(1) or constant.
    // Space complexity: O(1) or constant.
    public static double clockAngle(int hour, int minutes) {
        double hoursDegrees = (hour % 12 * 30) + ((double) minutes / 60 * 30);
        double minutesDegrees = minutes * 6;
        double angle = Math.abs(hoursDegrees - minutesDegrees);
        if (angle > 180) {
            return 360.0 - angle;
        }

        return angle;
    }
}
