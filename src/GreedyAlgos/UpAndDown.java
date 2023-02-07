package GreedyAlgos;

import java.util.Arrays;

public class UpAndDown {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(upAndDown("UD"))); // [0, 2, 1] (0 is less than 1, 2 is greater than 1)
        System.out.println(Arrays.toString(upAndDown("DUU"))); //[3,0,1,2]
    }

    // Runtime: O(N) where N is the total number of characters in s.
    // Space complexity: O(N) where N is the total number of characters in s.
    public static int[] upAndDown(String s){
        int[] values = new int[s.length() + 1];
        int lower = 0;
        int higher = s.length();

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'U'){
                values[i] = lower++;
            } else {
                values[i] = higher++;
            }
        }
        values[s.length()] = lower;
        return values;
    }
}
