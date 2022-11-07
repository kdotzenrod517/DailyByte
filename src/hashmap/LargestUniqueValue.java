package hashmap;

import java.util.HashMap;

public class LargestUniqueValue {

    public static void main(String[] args){
        System.out.println(largestUnique(new int[] {4, 9, 2, 9})); // 4
        System.out.println(largestUnique(new int[] {8, 1, 10, 1, 4, 8, 4, 10})); // -1
    }

    // Runtime: O(N) where N is the total number of elements in nums.
    // Space complexity: O(N) where N is the total number of elements in nums.
    public static int largestUnique(int[] nums){

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int max = -1;
        for(int i : map.keySet()){
            if(map.get(i) == 1 && i > max){
                max = i;
            }
        }

        return max;
    }
}
