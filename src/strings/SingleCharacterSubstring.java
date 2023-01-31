package strings;

public class SingleCharacterSubstring {

    public static void main(String[] args) {
        System.out.println(singleCharacterSubstring("aabbc")); // 7. ("a", "aa", "a", "b", "bb", "b", "c")
        System.out.println(singleCharacterSubstring("aaa")); // 6
    }

    // Runtime: O(N) where N is the total number of characters in s.
    // Space complexity: O(1) or constant.
    public static int singleCharacterSubstring(String s){
        int total = 0; // substrings with only one distinct character
        int count = 0; // count of how many times a specific character has occurred in a row
        int c = '*'; // currently repeated character respectively

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == c){
                count++;
            } else {
                c = s.charAt(i);
                count = 1;
            }
            total += count;
        }
        return total;
    }
}
