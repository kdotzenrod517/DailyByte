package Lists;

import java.util.Arrays;

public class AddOne {

    public static void main(String[] args){
        System.out.println(Arrays.toString(addOne(new int[]{1, 2}))); // [1, 3]
        System.out.println(Arrays.toString(addOne(new int[]{9, 9}))); // [1, 0, 0]
    }

    // Runtime: O(N) where N is the total number of elements in digits.
    // Space complexity: O(N) where N is the total number of elements in digit.
    // In the worst case, we must create a new array with an additional index.
    public static int[] addOne(int[] digits) {

        for(int i = digits.length - 1; i >= 0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}
