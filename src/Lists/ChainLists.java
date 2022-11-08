package Lists;

import java.util.Arrays;

public class ChainLists {

    public static void main(String[] args){
        System.out.println(maxChain(new int[][] {
                {3, 4},
                {5, 6},
                {7, 8}
        })); // 3
        System.out.println(maxChain(new int[][] {
                {9, 14},
                {3, 5},
                {4, 7}
        })); // 2
    }

    // Runtime: O(NlogN) where N is the total number of pairs in pairs.
    // Space complexity: O(1) or constant.
    public static int maxChain(int[][] pairs){
        Arrays.sort(pairs, (a, b) -> a[1] - b[1]);
        int end = Integer.MIN_VALUE;
        int max = 0;

        for(int[] pair : pairs){
            if(end < pair[0]){
                end = pair[1];
                max++;
            }
        }

        return max;
    }
}
