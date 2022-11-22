package strings;

public class ReverseLetters {

    public static void main(String[] args) {
        System.out.println(reverseLetters("abc*a")); // acb*a
        System.out.println(reverseLetters("Ab&e]a-Ta")); // aT&a]e-bA
    }


    // Runtime: O(N) where N is the total number of characters in s.
    // Space complexity: (N) where N is the total number of characters in s.
    public static String reverseLetters(String s) {

        StringBuilder reversed = new StringBuilder();
        int j = s.length() - 1;

        for(int i = 0; i < s.length(); i++){
            if(Character.isLetter(s.charAt(i))){
                while(!Character.isLetter(s.charAt(j))){
                    j--;
                }
                reversed.append(s.charAt(j--));
            } else {
                reversed.append(s.charAt(i));
            }
        }


        return reversed.toString();
    }
}
