package StacksAndQueues;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class GreaterElements {

    public static void main(String[] args) {
        // return [-1, 3, -1] because no element in nums2 is greater than 4, 3 is the first number
        // in nums2 greater than 1, and no element in nums2 is greater than 2.
        System.out.println(Arrays.toString(greaterElements(new int[]{4, 1, 2}, new int[]{1, 3, 4, 2})));
        //  return [3, -1] because 3 is the first greater
        //  element that occurs in nums2 after 2 and no element is greater than 4.
        System.out.println(Arrays.toString(greaterElements(new int[]{2, 4}, new int[]{1, 2, 3, 4})));

    }
    public static int[] greaterElements(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums2.length; i++) {
            while (!stack.empty() && nums2[i] > stack.peek()) {
                map.put(stack.pop(), nums2[i]);
            }
            stack.push(nums2[i]);
        }

        while (!stack.empty()) {
            map.put(stack.pop(), -1);
        }

        for (int i = 0; i < nums1.length; i++) {
            result[i] = map.get(nums1[i]);
        }

        return result;
    }
}
