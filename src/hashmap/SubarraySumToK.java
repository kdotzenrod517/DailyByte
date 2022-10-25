package hashmap;

import java.util.HashMap;

public class SubarraySumToK {

    public static void main(String[] args){
        System.out.println(subarraySum(new int[]{1,1,4}, 5)); // 1
        System.out.println(subarraySum(new int[]{3, 2, 2, 1, 1, 1}, 5)); // 3
    }


    // Runtime: O(N) where N is the total number of elements in nums.
    // Space complexity: O(N) where N is the total number of elements in nums.
    public static int subarraySum(int[] nums, int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(map.containsKey(sum - k)){
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
