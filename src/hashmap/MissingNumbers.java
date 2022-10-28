package hashmap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class MissingNumbers {

    public static void main(String[] args){
        System.out.println(missingNumber(new int[]{1, 2, 3, 3})); // [4]
        System.out.println(missingNumber(new int[]{3, 2, 4, 1, 5})); // []
    }

    // Runtime: O(N) where N is the total number of elements in nums.
    // Space complexity: O(N) where N is the total number of elements in nums.
    public static List<Integer> missingNumber(int[] nums){
        List<Integer> missingNumbers = new ArrayList<>();
        HashSet<Integer> numbers = new HashSet<>();
        for(int i: nums) {
            numbers.add(i);
        }

        for(int i = 1; i <= nums.length; i++) {
            if(!numbers.contains(i)) {
                missingNumbers.add(i);
            }
        }

        return missingNumbers;
    }
}
