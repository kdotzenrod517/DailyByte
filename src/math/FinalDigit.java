package math;

public class FinalDigit {

    public static void main(String[] args){
        System.out.println(finalDigit(123)); // 6 -> 1 + 2 + 3 = 6
        System.out.println(finalDigit(8353)); // 1 -> 8 + 3 + 5 + 3 = 19 = 1 + 9 = 10 = 1 + 0 = 1
    }

    // Runtime: O(N) where N is the total number of digits in num.
    // Space complexity: O(1) or constant.
    public static int finalDigit(int num){
        while(num >= 10) {
            int next = 0;
            while(num > 0) {
                next += (num % 10);
                num /= 10;
            }

            num = next;
        }

        return num;
    }
}
