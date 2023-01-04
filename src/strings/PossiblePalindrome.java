package strings;

import java.util.HashSet;

public class PossiblePalindrome {

    public static void main(String[] args) {
        System.out.println(possiblePalindrome("aeae")); // true ("aeea" or "eaae")
        System.out.println(possiblePalindrome("computer")); // false
    }

    // Runtime: O(N) where N is the total number of elements in s.
    // Space complexity: O(N) where N is the total number of elements in s.
    public static boolean possiblePalindrome(String s){
        HashSet<Character> chars = new HashSet<>();

        for(char c : s.toCharArray()){
            if(chars.contains(c)){
                chars.remove(c);
            } else {
                chars.add(c);
            }
        }

        return chars.size() == 0 || chars.size() == 1;
    }
}
