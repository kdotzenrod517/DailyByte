package strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AnagramElements {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(anagramElements(new int[]{8, 23, 2}, new int[]{2, 23, 8}))); // [2, 1, 0]
        System.out.println(Arrays.toString(anagramElements(new int[]{9, 3, 1, 5, 2, 4}, new int[]{2, 5, 1, 3, 4, 9}))); // [5,3,2,1,0,4]
    }

    // Runtime: O(N ) where N is the number of elements in A and B
    // Space complexity: O(N ) where N is the number of elements in A and B.
    public static int[] anagramElements(int[] A, int[] B) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < B.length; i++){
            map.put(B[i], i);
        }

        int[] response = new int[A.length];
        for(int i = 0; i < A.length; i++){
            response[i] = map.get(A[i]);
        }

        return response;
    }
}
