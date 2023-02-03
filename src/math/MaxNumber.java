package math;

import java.util.Arrays;

public class MaxNumber {

    public static void main(String[] args) {
        System.out.println(maxNumber(669)); // 969
        System.out.println(maxNumber(9969)); // 9999
    }

    // Runtime: O(N) where N is the total number of digits in nums.
    // Space complexity: O(N) where N is the total number of digits in nums.
    public static int maxNumber(int num){
        char[] digits = (num + "").toCharArray();
        for(int i = 0; i < digits.length; i++){
            if(digits[i] == '6'){
                digits[i] = '9';
                break;
            }
        }
        return Integer.parseInt(new String(digits));
    }
}
