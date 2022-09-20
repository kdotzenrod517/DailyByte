package strings;

import java.util.*;

public class GroupAnagrams {

    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"car", "arc", "bee", "eeb", "tea"}));
        // [
        //  ["car","arc"],
        //  ["tea"],
        //  ["bee","eeb"]
        // ]
    }

    // Runtime: O(N * MLogM) where N is the total number of words in strs and M is the total number of characters in any given word.
    // Space complexity: O(N) where N is the total number of words in strs.
    public static List<List<String>> groupAnagrams(String[] words) {

        Map<String, List<String>> map = new HashMap<>();

        for(String word : words){
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sorted = String.valueOf(chars);
            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(word);
        }

        return new ArrayList<>(map.values());
    }
}
