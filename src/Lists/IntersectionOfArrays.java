package Lists;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IntersectionOfArrays {

    public static void main(String[] args){
        System.out.println(intersection(new int[]{1, 2, 2, 3}, new int[]{0, 2, 2, 5})); // [2, 2]
    }

    // Runtime: O(N + M) where N is the total number of elements in nums1 and M
    // is the total number of elements in nums2.
    // Space complexity: O(min(N, M)) where N is the total number of elements in nums1
    // and M is the total number of elements in nums2.
    public static List<Integer> intersection(int[] nums1, int[] nums2){
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for(int i : nums1){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for(int i : nums2){
            if(map.containsKey(i) && map.get(i) > 0){
                result.add(i);
                map.put(i, map.get(i) - 1);
            }
        }
        return result;
    }
}
