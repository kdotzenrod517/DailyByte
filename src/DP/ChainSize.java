package DP;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ChainSize {

    // You are given a list of words and asked to find the longest chain.
    // Two words (or more) form a chain if a single letter can be added
    // anywhere in a word, s, to form a word, t (where s and t are both
    // words within the list of words you’re given). Return the length
    // of the longest chain you can form.
    public static void main(String[] args) {
        System.out.println(chainSize(new String[]{"a", "ab", "abc"})); // return 3 ("a" can be transformed to "ab" by adding a "b" and "ab" can be transformed by adding a "c" giving a chain length of 3).
        System.out.println(chainSize(new String[]{"a", "abc"})); // return 1 (both "a" or "abc" form their own chains of size one, they cannot be added together).

    }

    // Runtime: O(N x M) where N is the total number of words we’re given and N is the total number of characters any one of our words can have.
    // Space complexity: O(N) where N is the total number of words we’re given.
    public static int chainSize(String[] words) {
       Arrays.sort(words, (a, b) -> a.length() - b.length());
       Map<String, Integer> wordsToChainSize = new HashMap<>();
       int max = 0;
       for(String word : words){
           int count = 0;
           for(int i = 0; i < word.length(); i++){
               String next = word.substring(0, i) + word.substring(i + 1);
               count = Math.max(count, wordsToChainSize.getOrDefault(next, 0) + 1);
           }

           wordsToChainSize.put(word, count);
           max = Math.max(max, count);
       }

       return max;
    }
}
