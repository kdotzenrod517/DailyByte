package hashmap;

import java.util.HashSet;

public class IdenticalElements {


    // Whether or not two unique indices exist such that nums[i] = nums[j]
    // and the two indices i and jj are at most k elements apart.
    public static void main(String[] args) {
        System.out.println(checkDuplicatesWithinK(new int[]{1, 2, 1}, 1)); // false
        System.out.println(checkDuplicatesWithinK(new int[]{2, 3, 2}, 2)); // true
    }

    public static boolean checkDuplicatesWithinK(int arr[], int k) {
        // Creates an empty hashset
        HashSet<Integer> set = new HashSet<>();

        // Traverse the input array
        for (int i = 0; i < arr.length; i++) {
            // If already present n hash, then we found
            // a duplicate within k distance
            if (set.contains(arr[i]))
                return true;

            // Add this item to hashset
            set.add(arr[i]);

            // Remove the k+1 distant item
            if (i >= k)
                set.remove(arr[i - k]);
        }
        return false;
    }
}
