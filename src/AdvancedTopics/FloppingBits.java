package AdvancedTopics;

public class FloppingBits {

    public static void main(String[] args){
        System.out.println(flipFloppingBits(5)); // true, 5 in binary is 101 which alternates bit values between 0 and 1.
        System.out.println(flipFloppingBits(8)); // false, 8 in binary is 1000 which does not alternate bit values between 0 and 1.
    }

    // Runtime: O(1) or constant since every integer in Java will have a fixed number of bits (32).
    // Space complexity: O(1) or constant.
    public static boolean flipFloppingBits(int N) {
        int last = N % 2;
        N >>= 1;
        while(N > 0) {
            int current = N % 2;
            if(current == last) {
                return false;
            }

            last = current;
            N >>= 1;
        }

        return true;
    }
}
