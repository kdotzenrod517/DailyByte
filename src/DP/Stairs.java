package DP;

public class Stairs {

    // Given a staircase with N steps and the ability to climb either
    // one or two steps at a time, return the total number of ways to arrive at the top of the staircase.
    public static void main(String[] args) {
        System.out.println(stairs(2)); // 2 - 1 step + 1 step, 2 steps
        System.out.println(stairs(3)); // 3 - 1 step + 1 step + 1 step, 1 step + 2 steps, 2 steps + 1 step
    }

    // Runtime: O(N) where N is the number of steps in the staircase.
    // Space complexity: O(1) or constant as regardless of the size of N we only need
    // a few variables to solve our problem.
    public static int stairs(int n) {
        if(n == 1) {
            return 1;
        }

        int first = 1;
        int second = 2;
        for(int i = 3; i <= n; i++) {
            int next = first + second;
            first = second;
            second = next;
        }

        return second;
    }
}
