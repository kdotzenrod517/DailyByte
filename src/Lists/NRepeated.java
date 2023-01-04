package Lists;

import java.util.HashSet;

public class NRepeated {

    public static void main(String[] args) {
        System.out.println(nRepeated(new int[]{3, 3, 5, 1})); // 3
        System.out.println(nRepeated(new int[]{4, 2, 4, 5, 4, 1})); // 4
    }

    // Runtime: O(N) where N is the total number of element in nums.
    // Space complexity: O(N) where N is the total number of element in nums.
    public static int nRepeated(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            if(set.contains(i)){
                return i;
            } else {
                set.add(i);
            }
        }
        return -1;
    }
}
