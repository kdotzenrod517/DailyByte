package strings;

import java.util.HashMap;

public class CharacterScramble {

    //  Given two strings, passage and text return whether the characters in text can be used to form the given passage.
    // Note: Each character in text may only be used once and passage and text will only
    // contain lowercase alphabetical characters.
    public static void main(String[] args) {
        System.out.println(characterScramble("bat", "cat")); // false
        System.out.println(characterScramble("dog", "didnotgo")); // true
    }

    // Runtime: O(N + M) where N is the number of characters in passage and M is the number of characters in text.
    // This results from us iterating through both of them entirely.
    // Space complexity: O(1) or constant since we know our hash map can only grow to a maximum size of 26
    // (restricted by the constraint that we will only encounter lowercase alphabetical characters).
    public static boolean characterScramble(String passage, String text) {

        HashMap<Character, Integer> counts = new HashMap<>();

        for(Character c : text.toCharArray()){
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }

        for (Character c : passage.toCharArray()){
            if(!counts.containsKey(c) || counts.get(c) <= 0){
                return false;
            }

            counts.put(c, counts.get(c) - 1);
        }

        return true;
    }
}
