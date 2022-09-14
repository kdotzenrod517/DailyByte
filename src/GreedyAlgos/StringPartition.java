package GreedyAlgos;

import java.util.ArrayList;
import java.util.List;

public class StringPartition {

    public static void main(String[] args){
        System.out.println(cutString("abacdddecn")); // [3, 6, 1]
        System.out.println(cutString("aba")); // [3]
    }

    // Runtime: O(N) where N is the total number of characters in s.
    // Space complexity: O(1) to keep data structure last of not more than 26 characters.
    public static List<Integer> cutString(String S){
        int[] last = new int[26];
        for (int i = 0; i < S.length(); ++i)
            last[S.charAt(i) - 'a'] = i;

        int j = 0;
        int anchor = 0;
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < S.length(); ++i) {
            j = Math.max(j, last[S.charAt(i) - 'a']);
            if (i == j) {
                ans.add(i - anchor + 1);
                anchor = i + 1;
            }
        }
        return ans;
    }
}
