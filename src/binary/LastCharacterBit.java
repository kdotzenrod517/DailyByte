package binary;

public class LastCharacterBit {

    // You are given an integer array, bits, that only contains zeroes and ones and represents a binary sequence. Within our binary, there are two characters that are represented. One character can be represented by a single bit, 0, and another character can be represented with two bits, 10, or 11. Return whether or not the last character in our binary sequence is the character represented by a 0.
    // Note: The bits will always end with a zero.

    // Runtime: O(N) where N is the total number of elements in bits.
    // Space complexity: O(1) or constant.
    public boolean lastCharacterBit(int[] bits) {
        int i = 0;
        while (i < bits.length - 1) {
            if (bits[i] == 0) {
                i++;
            } else {
                i += 2;
            }
        }

        return i == bits.length - 1;
    }
}
