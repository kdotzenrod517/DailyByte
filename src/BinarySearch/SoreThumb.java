package BinarySearch;

public class SoreThumb {

    public static void main(String[] args){
        System.out.println(soreThumb(new int[]{1, 2, 3, 7, 5})); // 3
    }

    // Runtime: O(logN) where N is the total number of students.
    // Space complexity: O(1) or constant.
    public static int soreThumb(int[] students){
        int left = 0;
        int right = students.length - 1;

        while(left < right){
            int mid = left + (right - left) / 2;
            if(students[mid] > students[mid + 1]){
                right = mid;
            } else {
                left = mid + 1;
            }
        }


        return left;
    }
}
