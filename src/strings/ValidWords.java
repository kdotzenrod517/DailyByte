package strings;

import java.util.HashSet;

public class ValidWords {

    public static void main(String[] args) {
        System.out.println(validWords("abc", new String[]{"d", "ab", "abce"})); // 1
        System.out.println(validWords("ake", new String[]{"ail", "kea", "a"})); // 2
    }

    // Runtime: O(N + M) where N is the total number of characters in permitted and
    // M is the total number of characters within words.
    // Space complexity: O(N) where N is the total number of characters in permitted.
    public static int validWords(String permitted, String[] words){
        int count = 0;
        HashSet<Character> letters = new HashSet<>();
        for(Character c : permitted.toCharArray()){
            letters.add(c);
        }

        for(String s : words){
            int charCount = 0;

            for(char c : s.toCharArray()){
                if(letters.contains(c)){
                    charCount++;
                }
            }


            if(charCount == s.length()){
                count++;
            }
        }

        return count;
    }
}
