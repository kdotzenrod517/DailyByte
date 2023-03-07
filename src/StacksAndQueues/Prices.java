package StacksAndQueues;

import java.util.Arrays;
import java.util.Stack;

public class Prices {

    public static void main(String[] args) {
        // return [1, 0, 2].
        // For prices[0] you pay 3 - 2 = 1 dollars.
        // For prices[1] you pay 2 - 2 = 0 dollars.
        // For prices[2] you pay 2 dollars.
        System.out.println(Arrays.toString(shoppingSpree(new int[]{3, 2, 2})));
    }

    // Runtime: O(N) where N is the total number of elements in prices.
    // Space complexity: O(N) where N is the total number of elements in prices.
    public static int[] shoppingSpree(int[] prices){

        Stack<Integer> stack = new Stack<>();
        for(int i =0; i < prices.length; i++){
            if(!stack.isEmpty() && prices[stack.peek()] >= prices[i]){
                prices[stack.pop()] -= prices[i];
            }
            stack.push(i);
        }
        return prices;
    }
}
