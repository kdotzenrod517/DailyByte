package binary;

public class BinaryBits {

    public static void main(String[] args) {
        System.out.println(consecutiveOnes(new int[]{1, 0, 1, 1})); // 2
        System.out.println(consecutiveOnes(new int[]{0, 0, 0})); // 0
    }

    // Runtime: O(N) where N is the total number of elements in bits.
    // Space complexity: O(1) or constant.
    public static int consecutiveOnes(int[] bits){
        int count = 0;
        int max = 0;
        for(int bit : bits){
            if(bit == 1){
                max = Math.max(max, ++count);
            } else {
                count = 0;
            }
        }
        return max;
    }
}
