package strings;

public class IsSubsequence {

    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "aabbcc")); // true
        System.out.println(isSubsequence("cpu", "computer")); // true
        System.out.println(isSubsequence("xyz", "axbyc")); // false
    }

    // Runtime: O(N) where N is the length of t. This is because in the worst case,
    // we’ll have to iterate through all characters in t only to determine that s is not a subsequence of t.
    // Space complexity: O(1) or constant as we only need our index variable to solve our
    // problem regardless of the size of s and t.
    public static boolean isSubsequence(String s, String t){

        int index = 0;

        for(int i = 0; i < t.length(); i++){
            if(t.charAt(i) == s.charAt(index)){
                index++;
            }
            if(index == s.length()){
                return true;
            }
        }

        return false;
    }
}
