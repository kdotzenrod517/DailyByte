package SlidingWindow;

import java.util.Arrays;

public class VaultCode {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(vaultCode(new int[]{1, 2, 3}, 2))); // return [5, 4, 3] (2 + 3, 3 + 1, 1 + 2).
        System.out.println(Arrays.toString(vaultCode(new int[]{4, 2, 1}, -1))); // [3, 4, 1].
    }

    // Runtime: O(N) where N is the total number of elements in code.
    // Space complexity: O(N) where N is the total number of elements in code.
    public static int[] vaultCode(int[] code, int k){
        int[] decryptCode = new int[code.length];
        if (k == 0) {
            return decryptCode;
        }

        int start = 1;
        int end = k;
        if (k < 0) {
            k = -k;
            start = code.length - k;
            end = code.length - 1;
        }

        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += code[i];
        }

        for (int i = 0; i < code.length; i++) {
            decryptCode[i] = sum;
            sum -= code[start++ % code.length];
            sum += code[++end % code.length];
        }

        return decryptCode;
    }
}
