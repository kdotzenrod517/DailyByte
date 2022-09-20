package math;

import java.util.HashSet;

public class MagicNumber {

    //  A magical number is an integer such that when you repeatedly replace the number
    //  with the sum of the squares of its digits its eventually becomes one
    public static void main(String[] args){
        // 1^2 + 9^2 = 82
        // 8^2 + 2^2 = 68
        // 6^2 + 8^2 = 100
        // 1^2 + 0^2 + 0^2 = 1.
        System.out.println(magicNumber(19)); // true
        System.out.println(magicNumber(22)); // false
    }

    // Runtime: O(logN) where N is the initial number we’re given.
    // Space complexity: O(logN) where N is the initial number we’re given.
    public static boolean magicNumber(int N) {
        HashSet<Integer> seen = new HashSet<>();
        while(N != 1) {
            int sum = 0;
            while(N != 0) {
                sum += (N % 10) * (N % 10);
                N /= 10;
            }

            if(seen.contains(sum)) {
                return false;
            }

            seen.add(sum);
            N = sum;
        }

        return true;
    }
}
