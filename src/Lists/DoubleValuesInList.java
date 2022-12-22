package Lists;

import java.util.HashSet;
import java.util.Set;

public class DoubleValuesInList {

    public static void main(String[] args) {
        System.out.println(doubleValueExists(new int[]{4, 3, 9, 8})); // true
        System.out.println(doubleValueExists(new int[]{9, 2, 3, 5})); // false
    }

    // Runtime: O(N) where N is the total number of elements in nums.
    // Space complexity: O(N) where N is the total number of elements in nums.
    public static boolean doubleValueExists(int[] nums){
        Set<Integer> seen = new HashSet<>();
        for(int num : nums){
            if(seen.contains(num * 2) || num % 2  == 0 && seen.contains(num / 2)){
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}
