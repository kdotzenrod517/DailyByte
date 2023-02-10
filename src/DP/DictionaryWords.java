package DP;

import java.util.Set;

public class DictionaryWords {

    public static void main(String[] args){
        System.out.println(wordBreak("thedailybyte", Set.of("the", "daily", "byte"))); // true
        System.out.println(wordBreak("pizzaplanet", Set.of("plane", "pizza"))); // false
    }

    public static boolean wordBreak(String s, Set<String> dict) {

        boolean[] f = new boolean[s.length() + 1];
        f[0] = true;

        for(int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (f[j] && dict.contains(s.substring(j, i))) {
                    f[i] = true;
                    break;
                }
            }
        }

        return f[s.length()];
    }
}
