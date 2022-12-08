package Lists;

import java.util.ArrayList;
import java.util.List;

public class OutOfRange {

    public static void main(String[] args) {
        // return ["0->1","3->4","6","8->10"] (0 - 1, 3 - 4, 6, and 8 - 10 are not covered in nums).
        System.out.println(outOfRange(new int[]{2, 5, 7}, 0, 10));
        System.out.println(outOfRange(new int[]{}, 15, 20)); // return ["15->20"]
    }

    // Runtime: O(N) where N is the total number of elements in nums.
    // Space complexity: O(N) where N is the total number of elements in nums.
    public static List<String> outOfRange(int[] nums, int lower, int upper) {

        List<String> missing = new ArrayList<String>();
        int next = lower;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == next) {
                next++;
            } else if (nums[i] > next) {
                missing.add(addRange(next, nums[i] - 1));
                next = nums[i] + 1;
            }
        }

        if (next <= upper) {
            missing.add(addRange(next, upper));
        }

        return missing;
    }

    private static String addRange(int low, int high) {
        if (low == high) {
            return low + "";
        }

        return low + "->" + high;
    }
}