package strings;

public class ReverseWords {

    public static void main(String[] args){
        System.out.println(reverseWords("The Daily Byte")); // Byte Daily The
        System.out.println(swapWordsNoSplit("The Daily Byte")); // Byte Daily The
    }

    // Runtime: O(N) where N is the total number of characters in s.
    // Space complexity: O(N) where N is the total number of characters in s. This results from creating our string builder.
    public static String reverseWords(String s){
        StringBuilder reversed = new StringBuilder();
        String[] sArray = s.split(" ");

        for(int i = sArray.length - 1; i >= 0; i--){
            reversed.append(sArray[i]).append(" ");
        }

        return reversed.toString().trim();
    }

    public static String swapWordsNoSplit(String s) {
        StringBuilder reversed = new StringBuilder();
        int i = s.length() - 1;
        while (i >= 0) {
            int j = i;
            while (j >= 0 && s.charAt(j) != ' ') {
                j--;
            }

            reversed.append(s.substring(j + 1, i + 1) + " ");
            i = --j;
        }

        return reversed.toString().trim();
    }
}
