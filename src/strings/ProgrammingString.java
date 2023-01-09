package strings;

public class ProgrammingString {

    private static String PROGRAMMING = "programming";

    public static void main(String[] args) {
        System.out.println(programmingString("mingabcprojklgram")); // 1
        System.out.println(programmingString("rammingabcprogrammingdefprog")); // 2
    }

    // Runtime: O(N) where N is the total number of characters in s.
    // Space complexity: O(1) or constant.
    public static int programmingString(String text){
        String programming = "programming";
        int[] characters = new int[26];
        for (char c: text.toCharArray()) {
            characters[c - 'a']++;
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < programming.length(); i++) {
            char current = programming.charAt(i);
            int divisor = current == 'm' ? 2 : 1;
            min = Math.min(min, characters[current - 'a'] / divisor);
        }

        return min;
    }
}
