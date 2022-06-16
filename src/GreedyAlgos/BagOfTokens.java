package GreedyAlgos;

import java.util.Arrays;

public class BagOfTokens {

    public static void main(String[] args) {
        int[] tokens1 = {100, 150, 200};
        int[] tokens2 = {100, 200, 300, 400};
        int[] tokens3 = {300};
        System.out.println(bagOfTokensScore(tokens1, 150)); // 1
        System.out.println(bagOfTokensScore(tokens2, 200)); // 2
        System.out.println(bagOfTokensScore(tokens3, 200)); // 0
    }

    // Time: O(nlogn) where n is the length of tokens
    // Space: O(logn)
    public static int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);

        int lo = 0;
        int hi = tokens.length - 1;
        int points = 0;
        int ans = 0;

        while (lo <= hi && (power >= tokens[lo] || points > 0)) {
            while (lo <= hi && power >= tokens[lo]) {
                power -= tokens[lo++];
                points++;
            }

            ans = Math.max(ans, points);
            if (lo <= hi && points > 0) {
                power += tokens[hi--];
                points--;
            }
        }

        return ans;
    }
}
