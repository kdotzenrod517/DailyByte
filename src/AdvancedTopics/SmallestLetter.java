package AdvancedTopics;

public class SmallestLetter {

    // You are given two string arrays, queries and words.
    // For any string, s, f(s) is equal to the number of times the
    // smallest lexicographical characters occurs in s.
    // For each query, queries[i] count the total number of words
    // where f(queries[i]) < f(word) and return the answer as an array.

    // Runtime: O(N + M) where N is the total number of characters in all queries and M is the total number of characters in all words.
    // Space complexity: O(K) where K is the total number of strings within queries.
    public int[] smallestLetter(String[] queries, String[] words) {
        int [] counts = new int[11];
        for(String word : words){
            int count = f(word);
            counts[count]++;
        }

        int sum = 0;
        for (int i = 0; i < counts.length; i++) {
            sum += counts[i];
            counts[i] = sum;
        }

        int[] smallerCount = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int count = f(queries[i]);
            smallerCount[i] = counts[counts.length - 1] - counts[count];
        }

        return smallerCount;
    }

    public int f(String s) {
        int[] chars = new int[26];
        for (int i = 0; i < s.length(); i++) {
            chars[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != 0) {
                return chars[i];
            }
        }

        return -1;
    }
}
