package strings;

import java.nio.charset.StandardCharsets;

public class InsertCommas {

    public static void main(String[] args) {
        System.out.println(insertCommas(200000000)); // "200,000,000".
        System.out.println(insertCommas(5000)); // "5,000".
        System.out.println(insertCommas(100)); // 100
    }

    // Runtime: O(N) where N is the total number of digits in N.
    //Space complexity: O(N) where N is the total number of digits in N.
    public static String insertCommas(int N){
        String number = N + "";
        StringBuilder result = new StringBuilder();
        for (int i = number.length(); i > 0; i -= 3) {
            if (result.length() > 0) {
                result.insert(0, ",");
            }
            result.insert(0, number.substring(Math.max(0, i - 3), i));
        }

        return result.toString();
    }
}
