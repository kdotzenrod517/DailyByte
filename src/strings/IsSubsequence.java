package strings;

public class IsSubsequence {

    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "aabbcc")); // true
        System.out.println(isSubsequence("cpu", "computer")); // true
        System.out.println(isSubsequence("xyz", "axbyc")); // false
    }

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
