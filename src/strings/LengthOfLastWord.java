package strings;

public class LengthOfLastWord {

    public static void main(String[] args){
        System.out.println(lengthOfLastWord("The Daily Byte")); // return 4 (because "Byte" is four characters long).
    }

    // Runtime: O(N) where N is the total number of characters in s.
    // Space complexity: O(N) where N is the total number of characters in s.
    // This results from creating a new string from s that is trimmed.
    public static int lengthOfLastWord(String s){
        int count = 0;

        String trimmed = s.trim();

        for(int i = trimmed.length() - 1; i >= 0; i--){
            if(trimmed.charAt(i) == ' '){
                return count;
            } else {
                count++;
            }
        }

        return count;
    }
}
