package Lists.Bits;

public class BitArray {

    public static void main(String[] args) {
        System.out.println(oneBits(new int[]{0, 1, 1, 0, 1})); // 3
        System.out.println(oneBits(new int[]{1, 1, 1, 1, 1, })); // 4
    }

    // Runtime: O(N) where N is the total number elements in bits.
    // Space complexity: O(1) or constant.
    public static int oneBits(int[] bits){
        int prev = 0;
        int count = 0;
        int longest = 0;

        for(int i = 0; i < bits.length; i++){
            if(bits[i] == 1){
                count++;
            } else {
                longest = Math.max(longest, count + prev);
                prev = count;
                count = 0;
            }
        }

        longest = Math.max(longest, count + prev);
        return longest == bits.length ? longest - 1 : longest;
    }
}
