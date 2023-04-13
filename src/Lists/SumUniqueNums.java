package Lists;

import java.util.HashMap;

public class SumUniqueNums {

    public static void main(String[] args) {
        System.out.println(sumUniques(new int[]{1, 3, 5, 5, 2})); // return 6 (1 + 3 + 2).
        System.out.println(sumUniques(new int[]{4, 4, 2, 3, 3, 2})); // return 0
    }

    // Runtime: O(N) where N is the total number of elements in nums.
    // Space complexity: O(N) where N is the total number of elements in nums.
    public static int sumUniques(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(int num : map.keySet()){
            if(map.get(num) == 1){
                count += num;
            }
        }

        return count;
    }
}
