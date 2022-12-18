package math;

public class AngryBits {

    // You are given an integer, n, and a binary number represented as an integer array,
    // binary. Each of the one bits in binary must be separated by at least one
    // zero bit otherwise the bits become angry.
    // Return whether or not it’s possible to flip at least n zero bits to
    // one bits without making the bits angry.
    public static void main(String[] args) {
        System.out.println(angryBits(new int[]{ 1, 0, 0, 1}, 1)); // false
        System.out.println(angryBits(new int[]{0, 1, 0, 0, 1, 0, 0, 0, 1}, 1)); // true
    }


    // Runtime: O(N) where N is the total number of elements in binary.
    // Space complexity: O(1) or constant.
    public static boolean angryBits(int[] binary, int n) {
        for(int i = 0; i < binary.length; i++) {
            if(binary[i] == 0) {
                int previous = i == 0 ? 0 : binary[i - 1];
                int next = i == binary.length - 1 ? 0 : binary[i + 1];
                if(previous == 0 && next == 0) {
                    binary[i] = 1;
                    n--;
                }
            }
        }

        return n <= 0;
    }
}
