package strings;

public class LongestUniqueSubstring {

    // Given a string s, return the length of the longest substring containing at most two distinct characters.
    public static void main(String[] args){
        System.out.println(longestUniqueSubstring("aba")); // 3
        System.out.println(longestUniqueSubstring("abca")); // 2
    }

    // Runtime: O(N) where N is the total number of characters in s.
    // Space complexity: O(1) or constant
    public static int longestUniqueSubstring(String s) {
        int[] counts = new int[26];
        int max = 0;
        int start = 0;
        int end = 0;
        int characterCount = 0;

        while(end < s.length()) {
            if(counts[s.charAt(end++) - 'a']++ == 0) {
                characterCount++;
            }

            while(characterCount > 2) {
                if(counts[s.charAt(start++) - 'a']-- == 1) {
                    characterCount--;
                }
            }

            max = Math.max(max, end - start);
        }

        return max;
    }

}
