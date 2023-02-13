package math;

import java.util.LinkedList;
import java.util.List;

public class ArraySum {

    public static void main(String[] args) {
        System.out.println(arraySum(new int[]{1, 2, 3}, 10)); // [1, 3, 3]
        System.out.println(arraySum(new int[]{9}, 3)); // [1, 2]
    }

    // Runtime: O(max(N, logK)) where N is the total number of elements in A.
    // Space complexity: O(max(N, logK)) where N is the total number of elements in A.
    public static List<Integer> arraySum(int[] A, int K){
        List<Integer> sum = new LinkedList<>();
        for (int i = A.length - 1; i >= 0; i--) {
            sum.add(0, (A[i] + K) % 10);
            K = (A[i] + K) / 10;
        }

        while (K > 0) {
            sum.add(0, K % 10);
            K /= 10;
        }

        return sum;
    }
}
