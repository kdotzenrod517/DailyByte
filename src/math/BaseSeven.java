package math;

public class BaseSeven {

    public static void main(String[] args){
        System.out.println(baseSeven(42)); // 60
    }

    // Runtime: O(logN) (base 7) where N is our num.
    // Space complexity: O(logN) (base 7) where N is our num.
    public static String baseSeven(int num){
        if(num == 0) {
            return "0";
        }

        boolean negative = num < 0;
        StringBuilder sb = new StringBuilder();
        while(num != 0) {
            sb.append(Math.abs(num % 7));
            num /= 7;
        }

        if(negative) {
            sb.append("-");
        }

        return sb.reverse().toString();
    }
}
