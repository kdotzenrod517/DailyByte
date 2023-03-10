package Lists.Bits;

public class OneSubstrings {

    public static void main(String[] args) {
        System.out.println(oneSubstrings("1011")); // 4 ("1", "1", "1", and "11").
        System.out.println(oneSubstrings("000")); // 0
    }

    // Runtime: O(N) where N is the total number of characters in bits.
    // Space complexity: O(1) or constant.
    public static int oneSubstrings(String bits) {

        int total = 0;
        int count = 0;

        for(int i = 0; i < bits.length(); i++){
            if(bits.charAt(i) == '1'){
                total += ++count;
            } else {
                count = 0;
            }
        }

        return total;
    }
}
