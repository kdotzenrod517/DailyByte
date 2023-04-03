package math;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrderedDigits {

    public static void main(String[] args) {
        System.out.println(orderedDigits(10, 25)); // return [12, 23].
        System.out.println(orderedDigits(15, 48)); // return [23, 34, 45].
    }

    // Runtime: O(1) or constant.
    // Space complexity: O(1) or constant.
    public static List<Integer> orderedDigits(int low, int high){
        List<Integer> values = new ArrayList<>();
        for (int digit = 1; digit < 9; digit++) {
            int nextDigit = digit;
            int value = digit;
            while (value <= high && nextDigit != 10) {
                if (value >= low) {
                    values.add(value);
                }
                value = value * 10 + ++nextDigit;
            }
        }

        Collections.sort(values);
        return values;
    }
}
