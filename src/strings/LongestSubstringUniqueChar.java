package strings;

public class LongestSubstringUniqueChar {

    public static void main(String[] args) {
        System.out.println(longestSubstring("aabc")); // 2
        System.out.println(longestSubstring("abcabbccabccc")); // 3
    }

    // Runtime: O(N) where N is the total number of characters in s.
    // Space complexity: O(1) or constant.
    public static int longestSubstring(String s){
        int count = 1;
        int max = 1;
        char last = s.charAt(0);

        for(int i = 1; i < s.length(); i++){
            char curr = s.charAt(i);
            if(last == curr){
                count++;
                max = Math.max(max, count);
            } else {
                count = 1;
                last = curr;
            }
        }

        return max;
    }
}
