package Lists;

public class SortNumbers {

    // Runtime: O(N + M) where N is the total number of elements in nums1 and M is the total number of elements in nums2.
    // Space complexity: O(1) or constant.
    public int[] sortNumbers(int[] nums1, int[] nums2) {
        int[] counts = new int[10001];
        for(int i: nums1) {
            counts[i]++;
        }

        int index = 0;
        for(int i: nums2) {
            while(counts[i]-- > 0) {
                nums1[index++] = i;
            }
        }

        for(int i = 0; i < counts.length; i++) {
            while(counts[i]-- > 0) {
                nums1[index++] = i;
            }
        }

        return nums1;
    }
}
