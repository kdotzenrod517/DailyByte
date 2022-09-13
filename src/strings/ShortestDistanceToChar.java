package strings;

import java.util.Arrays;

public class ShortestDistanceToChar {

    public static void main(String[] args){
        System.out.println(Arrays.toString(shortestToChar("dailybyte", 'y')));
        // return [4, 3, 2, 1, 0, 1, 0, 1, 2]
    }

    // Runtime: O(N) where N is the total number of characters in s.
    // Space complexity: O(N) where N is the total number of characters in s.
    public static int[] shortestToChar(String S, char C) {
        int N = S.length();
        int[] ans = new int[N];
        // Integer overflow, for case when going left and c is not found yet,
        int prev = Integer.MIN_VALUE / 2;

        for (int i = 0; i < N; ++i) {
            if (S.charAt(i) == C) prev = i;
            ans[i] = i - prev;
        }

        prev = Integer.MAX_VALUE / 2;
        for (int i = N-1; i >= 0; --i) {
            if (S.charAt(i) == C) prev = i;
            ans[i] = Math.min(ans[i], prev - i);
        }

        return ans;
    }
}
