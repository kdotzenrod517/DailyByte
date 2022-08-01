package hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class KeyboardRows {


    public static void main(String[] args){
        System.out.println(keyboardWords(new String[]{"two", "dad", "cat"})); // two, dad
        System.out.println(keyboardWords(new String[]{"ufo", "xzy", "byte"}));
    }

    // Runtime: O(N) where N is the total number of characters in our words list.
    // Space complexity: O(M) where M is the total number of words in our words list.
    // This results from creating a new list with in the worst case M words
    // (i.e. all words can be typed using one row of the keyboard).
    public static List<String> keyboardWords(String[] words) {
        HashMap<Character, Integer> map = new HashMap<>();
        String topRow = "qwertyuiop";
        String middleRow = "asdfghjkl";
        String bottomRow = "zxcvbnm";
        for(char c: topRow.toCharArray()) {
            map.put(c, 0);
        }
        for(char c: middleRow.toCharArray()) {
            map.put(c, 1);
        }
        for(char c: bottomRow.toCharArray()) {
            map.put(c, 2);
        }

        List<String> result = new ArrayList<>();
        for(String word: words) {
            int row = map.get(word.charAt(0));
            boolean isValid = true;
            for(int i = 1; i < word.length(); i++) {
                if(map.get(word.charAt(i)) != row) {
                    isValid = false;
                    break;
                }
            }

            if(isValid) {
                result.add(word);
            }
        }

        return result;
    }
}
