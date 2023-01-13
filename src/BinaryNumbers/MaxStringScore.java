package BinaryNumbers;

public class MaxStringScore {

    public static void main(String[] args) {
        System.out.println(maxStringScore("10")); // 0
        System.out.println(maxStringScore("0011")); // 4
    }

    // Runtime: O(N) where N is the total number of elements in binary.
    // Space complexity: O(1) or constant.
    public static int maxStringScore(String binary) {
        int oneCount = 0;
        for(int i = 0; i < binary.length(); i++) {
            if(binary.charAt(i) == '1') {
                oneCount++;
            }
        }

        int maxScore = 0;
        int zeroCount = 0;
        for(int i = 0; i < binary.length() - 1; i++) {
            if(binary.charAt(i) == '0') {
                zeroCount++;
            } else {
                oneCount--;
            }

            maxScore = Math.max(maxScore, zeroCount + oneCount);
        }

        return maxScore;
    }
}
