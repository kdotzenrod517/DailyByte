package Lists;

import java.util.ArrayList;
import java.util.List;

public class Intersection3Arrays {

    public static void main(String[] args) {
        System.out.println(intersectionThreeArrays(new int[]{1, 2, 3}, new int[]{1, 2}, new int[]{1})); // [1]
        System.out.println(intersectionThreeArrays(new int[]{4, 5, 6}, new int[]{7, 8, 9}, new int[]{10})); // []
    }

    // Runtime: O(N) where N is the total number of values in the smallest of our three arrays.
    // Space complexity: O(N) where N is the total number of values in the smallest of our three arrays.
    private static List<Integer> intersectionThreeArrays(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> result = new ArrayList<>();
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < nums1.length && j < nums2.length && k < nums3.length){
            if(nums1[i] == nums2[j] && nums2[j] == nums3[k]){
                result.add(nums1[i]++);
                j++;
                k++;
            } else if (nums1[i] < nums2[j]){
                i++;
            } else if (nums2[j] < nums3[k]){
                j++;
            } else {
                k++;
            }
        }
        return result;
    }
}
