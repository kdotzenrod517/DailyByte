package AdvancedTopics;

public class GymLockers {

    // In a gym hallway there are N lockers. You walk back and forth down the hallway opening and closing lockers.
    // On your first pass you open all the lockers. On your second pass, you close every other locker.
    // On your third pass you open every third locker. After walking the hallway N times opening/closing lockers in
    // the previously described manner, how many locker are left open?
    public static void main(String[] args){
        System.out.println(gymLockers(1)); // 1, You walk down the hallway once and open the only locker.
        System.out.println(gymLockers(2)); // 1, You walk down the hallway and open both lockers. You walk back down the hallway and close the last locker.
    }

    // Runtime: O(1) or constant.
    // Space complexity: O(1) or constant.
    public static int gymLockers(int n) {
        return (int)Math.sqrt(n);
    }
}
