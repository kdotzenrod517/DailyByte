package DP;

import java.util.HashMap;
import java.util.Map;

public class EqualBits {

    public static void main(String[] args) {
        System.out.println(equalBits(new int[]{1, 0, 1, 1, 0, 0})); // return 6 (the entire sequence has the 3 zeroes and 3 ones).
        System.out.println(equalBits(new int[]{1, 1})); // 0
    }

    // Runtime: O(N) where N is the total number of elements in bits. linear
    // Space complexity: O(N) where N is the total number of elements in bits.
    public static int equalBits(int[] bits){
        for(int i = 0; i < bits.length; i++){
            if(bits[i] == 0){
                bits[i] = -1;
            }
        }

        Map<Integer, Integer> sums = new HashMap<>();
        sums.put(0, -1);
        int max = 0;
        int sum = 0;

        for(int i = 0; i < bits.length; i++){
            sum += bits[i];
            if(sums.containsKey(sum)){
                max = Math.max(max, i - sums.get(sum));
            } else {
                sums.put(sum, i);
            }
        }

        return max;
    }
}
