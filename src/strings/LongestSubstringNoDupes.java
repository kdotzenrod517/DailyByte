package strings;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringNoDupes {


    public static void main(String[] args){
        System.out.println(longestSubstring("ababbc")); // 2
        System.out.println(longestSubstring("abcdssa")); // 5
    }

    // Runtime: O(N) where N is the total number of characters in s.
    // Space complexity: O(N) where N is the total number of characters in s.
    public static int longestSubstring(String s){
        Set<Character> seen = new HashSet<>();
        int max = 0;
        int i = 0;
        int j = 0;

        while(j < s.length()){
            if(!seen.contains(s.charAt(j))){
                seen.add(s.charAt(j++));
                max = Math.max(max, j - i);
            } else {
                seen.remove(s.charAt(i++));
            }
        }

        return max;
    }
}
