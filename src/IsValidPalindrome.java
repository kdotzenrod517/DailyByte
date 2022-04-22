public class IsValidPalindrome {

    public static void main(String[] args){

        System.out.println(isValidPalindrome("level"));
        System.out.println(isValidPalindrome("algorithm"));
        System.out.println(isValidPalindrome("A man, a plan, a canal: Panama."));
    }

    public static Boolean isValidPalindrome(String s){
        s = s.replaceAll("[^A-Za-z]", "").toLowerCase();
        int i = 0;
        int j = s.length() - 1;

        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
