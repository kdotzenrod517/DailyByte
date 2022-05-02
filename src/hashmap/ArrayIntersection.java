package hashmap;

import java.util.Arrays;
import java.util.HashSet;

public class ArrayIntersection {

    public static void main(String[] args){
        System.out.println(Arrays.toString(intersectionOfArrays(new int[]{2, 4, 4, 4}, new int[]{2, 4}))); // [2, 4]
        System.out.println(Arrays.toString(intersectionOfArrays(new int[]{1, 2, 3, 3}, new int[]{3, 3}))); // [3]
        System.out.println(Arrays.toString(intersectionOfArrays(new int[]{2, 4, 6, 8}, new int[]{1, 3, 5, 7}))); // []
    }

    public static int[] intersectionOfArrays(int[] nums1, int[] nums2){
        HashSet<Integer> set1 = new HashSet<>();
        for(int i : nums1) set1.add(i);
        HashSet<Integer> set2 = new HashSet<>();
        for(int i : nums2) set2.add(i);

        set1.retainAll(set2);

        int i = 0;
        int[] response = new int[set1.size()];

        for(int j : set1) response[i++] = j;

        return response;
    }
}
