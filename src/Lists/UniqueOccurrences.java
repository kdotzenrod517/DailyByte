package Lists;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class UniqueOccurrences {

    public static void main(String[] args) {
        System.out.println(uniqueOccurrences(new int[]{1, 3, 3, 2, 2, 2})); // true
        System.out.println(uniqueOccurrences(new int[]{4, 10})); // false
    }

    // Runtime: O(N) where N is the total number of elements in nums.
    // Space complexity: O(N) where N is the total number of elements in nums.
    public static boolean uniqueOccurrences(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        Set<Integer> occurrences = new HashSet<>();
        for(int i : map.keySet()){
            int freq = map.get(i);
            if(occurrences.contains(freq)){
                return false;
            } else {
                occurrences.add(freq);
            }

        }

        return true;
    }
}
