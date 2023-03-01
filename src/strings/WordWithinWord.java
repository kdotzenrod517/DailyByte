package strings;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class WordWithinWord {

    public static void main(String[] args) {
        System.out.println(wordWithinWord(new String[]{"abc", "a", "b"})); // return ["a", "b"].
        System.out.println(wordWithinWord(new String[]{"ab", "ba", "c"})); // return [].
    }

    // Runtime: O(N2) where N is the total number of elements in words.
    // Space complexity: O(N) where N is the total number of elements in words.
    public static List<String> wordWithinWord(String[] words){
        Arrays.sort(words, ((a, b) -> a.length() - b.length()));
        List<String> substrings = new LinkedList<>();
        for(int i = 0; i < words.length; i++){
            for(int j = i + 1; j < words.length; j++){
                if(words[j].contains(words[i])){
                    substrings.add(words[i]);
                    break;
                }
            }
        }
        return substrings;
    }
}
