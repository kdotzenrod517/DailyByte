package math;

public class ThirdPower {

    // Given an integer n, return whether or not it is a power of three.
    public static void main(String[] args){
        System.out.println(powerOfThree(9)); // true
        System.out.println(powerOfThree(50)); // false

    }

    // Runtime: O(logn) (using base 3).
    // Space complexity: O(1) or constant.
    public static boolean powerOfThree(int n){
        long num = 1;
        while(num < n){
            num *= 3;
        }
        return num == n;
    }
}
