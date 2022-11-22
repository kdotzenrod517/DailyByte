package AdvancedTopics;

import java.util.Arrays;
import java.util.Stack;

public class Dominoes {

    public static void main(String[] args){
        System.out.println(Arrays.toString(dominoes(new int[]{3, -3}))); // []
        // (-3 destroys both dominoes to its left and the second two destroys the domino to the right of it).
        System.out.println(Arrays.toString(dominoes(new int[]{1, 2, -3, 2, -1}))); // [-3, 2]
    }

    // Runtime: O(N) where N is the total number of elements in dominoes.
    // Space complexity: O(N) where N is the total number of elements in dominoes.
    public static int[] dominoes(int[] dominoes){
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        while(i < dominoes.length){
            if(dominoes[i] > 0){
                stack.push(dominoes[i]);
            } else {
                while(!stack.isEmpty() && stack.peek() > 0 && stack.peek() < Math.abs(dominoes[i])){
                    stack.pop();
                }
                if(stack.isEmpty() || stack.peek() < 0){
                    stack.push(dominoes[i]);
                } else if(stack.peek() == Math.abs(dominoes[i])) {
                    stack.pop();
                }
            }
            i++;
        }

        int[] response = new int[stack.size()];
        for(i = stack.size() - 1; i >= 0; i--){
            response[i] = stack.pop();
        }

        return response;
    }
}
