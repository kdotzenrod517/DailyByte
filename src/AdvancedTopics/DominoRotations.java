package AdvancedTopics;

public class DominoRotations {

    public static void main(String[] args){
        // We can rotate the second and fourth dominoes to make all values in the top row of our dominoes equal.
        System.out.println(minRotations(new int[]{2,1,2,4,2,2}, new int[]{5,2,6,2,3,2})); // 2
    }

    // Runtime: O(N) where N is the length of top.
    // Space complexity: O(1) or constant.
    public static int minRotations(int[] tops, int[] bottoms){
        int minSwaps = Math.min(swap(tops[0], tops, bottoms),
                swap(bottoms[0], tops, bottoms));
        minSwaps = Math.min(minSwaps, swap(tops[0], bottoms, tops));
        minSwaps = Math.min(minSwaps, swap(bottoms[0], bottoms, tops));

        return minSwaps == Integer.MAX_VALUE ? -1 : minSwaps;
    }

    public static int swap(int target, int[] tops, int[] bottoms){
        int minSwaps = 0;


        for(int i = 0; i < tops.length; i++){
            if(tops[i] != target && bottoms[i] != target){
                return Integer.MAX_VALUE;
            } else if (tops[i] != target){
                minSwaps++;
            }
        }

        return minSwaps;
    }
}
