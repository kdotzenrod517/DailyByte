package strings;

public class MergeStrings {

    public static void main(String[] args) {
        System.out.println(mergeStrings("abc", "def")); // adbecf
    }

    // Runtime: O(N + M) where N is the number of characters in s and M is the number of characters in t.
    // Space complexity: O(N + M) where N is the number of characters in s and M is the number of characters in t.
    public static String mergeStrings(String s, String t) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int j = 0;
        while(i < s.length() || j < t.length()){
            if(i < s.length()){
                sb.append(s.charAt(i++));
            }
            if(j < t.length()){
                sb.append(t.charAt(j++));
            }
        }

        return sb.toString();
    }

}
