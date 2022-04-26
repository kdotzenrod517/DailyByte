package strings;

public class ValidPalindromeOneRemoved {

    public static void main(String[] args) {
        System.out.println(isValidPalindromeOne("abcba")); // true
        System.out.println(isValidPalindromeOne("foobof")); // true
        System.out.println(isValidPalindromeOne("abccab")); // false
    }

    public static boolean isValidPalindromeOne(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return checkPalindrome(s, i + 1, j) || checkPalindrome(s, i, j - 1);
            }
            i++;
            j--;
        }

        return true;
    }

    public static boolean checkPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) {
                return false;
            }
        }
        return true;
    }

}
