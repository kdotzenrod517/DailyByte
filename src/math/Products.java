package math;

import java.util.Arrays;

public class Products {

    public static void main(String[] args){
        // 6 = 3 * 2 (we exclude 1)
        // 3 = 3 * 1 (we exclude 2)
        // 2 = 2 * 1 (we exclude 3)
        System.out.println(Arrays.toString(products(new int[]{1, 2, 3}))); // 6, 3, 2
    }

    // Runtime: O(N) where N is the total number of elements in nums.
    // Space complexity: O(N) where N is the total number of element in nums. This results from building a return array that is of size N.
    public static int[] products(int[] nums) {
        int[] products = new int[nums.length];
        int left = 1;
        for(int i = 0; i < nums.length; i++) {
            products[i] = left;
            left *= nums[i];
        }

        int right = 1;
        for(int i = nums.length - 1; i >= 0; i--) {
            products[i] *= right;
            right *= nums[i];
        }

        return products;
    }

}
