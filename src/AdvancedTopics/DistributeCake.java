package AdvancedTopics;

import java.util.Arrays;

public class DistributeCake {

    //  You are at a birthday party and are asked to distribute cake to your guests.
    //  Each guest is only satisfied if the size of the piece of cake they’re given,
    //  matches their appetite (i.e. is greater than or equal to their appetite).
    //  Given two arrays, appetite and cake where the ith element of appetite represents the
    //  ith guest’s appetite, and the elements of cake represents the sizes of cake you have to distribute,
    //  return the maximum number of guests that you can satisfy.
    public static void main(String[] args){
        System.out.println(distributeCake(new int[] {1, 2, 3}, new int[] {1, 2, 3})); // 3
        System.out.println(distributeCake(new int[] {3, 4, 5}, new int[] {2})); // 0
    }

    // Runtime: O(NlogN) where N is the total number of guests we need to serve (i.e. appetite.length).
    // This results from sorting both our cake and our guests’ appetite (which in the worst case will be the same length).
    // Space complexity: O(1) or constant since the arrays that we sort are already given to us as parameters.
    public static int distributeCake(int[] appetite, int[] cake) {
        Arrays.sort(appetite);
        Arrays.sort(cake);
        int count = 0;
        int i = 0;
        int j = 0;
        while(i < cake.length && j < appetite.length) {
            if(cake[i] >= appetite[j]) {
                count++;
                i++;
                j++;
            } else {
                i++;
            }
        }

        return count;
    }
}
