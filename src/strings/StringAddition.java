package strings;

public class StringAddition {

    public static void main(String[] args){
        System.out.println(stringAddition("2", "5")); // 7
        System.out.println(stringAddition("7", "95")); // 102
    }

    // Runtime: O(N + M) where N is the total number of digits in num1 and M is the total number of digits in num2.
    // Space complexity: O(max(N, M)) where N is the total number of digits in num1 and M is the total number of digits in num2.
    public static String stringAddition(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int sum = 0;
        int carry = 0;
        while(i >= 0 || j >= 0) {
            sum = carry;
            if(i >= 0) {
                sum += num1.charAt(i--) - '0';
            }

            if(j >= 0) {
                sum += num2.charAt(j--) - '0';
            }

            carry = sum / 10;
            sum %= 10;
            result.append(sum);
        }

        if(carry != 0) {
            result.append(carry);
        }

        return result.reverse().toString();
    }
}
