package hashmap;

public class IsAnagram {

    public static void main(String[] args) {
        System.out.println(isAnagram("tac", "cat")); // true
        System.out.println(isAnagram("listen", "silent")); // true
        System.out.println(isAnagram("program", "function")); // false
    }

    private static boolean isAnagram(String s1, String s2) {

        if (s1.length() != s2.length()) return false;

        int[] charMap = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            charMap[s1.charAt(i) - 'a']++;
            charMap[s2.charAt(i) - 'a']--;
        }

        for (int i : charMap) {
            if (i != 0) {
                return false;
            }
        }

        return true;
    }
}
