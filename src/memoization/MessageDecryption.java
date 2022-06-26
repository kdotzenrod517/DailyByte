package memoization;

import java.util.HashMap;
import java.util.Map;

public class MessageDecryption {

    // This question is asked by Microsoft. Given a message that is encoded using the following encryption method…
    //
    // A -> 1
    // B -> 2
    // C -> 3
    // ...
    // Z -> 26
    // Note: ‘0’ has no mapping and a character following a ‘0’ also has no mapping (i.e. “03”)
    public static void main(String[] args){;
        System.out.println(numDecodings("23")); // 2
        System.out.println(numDecodings("1234")); // 3
    }

    // Runtime: O(N) where N is the total number of characters in our message.
    // Space complexity: O(N) where N is the total number of characters in our array.
    // This results from storing at most N elements in our memoize hash map.
    public static int numDecodings(String message) {
        if (message == null || message.length() == 0) {
            return 0;
        }

        return decryptMessage(0, message, new HashMap<Integer, Integer>());
    }

    public static int decryptMessage(int index, String message, Map<Integer, Integer> memoize) {
        if (index >= message.length()) {
            return 1;
        }
        if (message.charAt(index) == '0') {
            return 0;
        }
        if (index == message.length() - 1) {
            return 1;
        }
        if (memoize.containsKey(index)) {
            return memoize.get(index);
        }

        int waysToDecrypt = decryptMessage(index + 1, message, memoize);
        if (Integer.parseInt(message.substring(index, index + 2)) <= 26) {
            waysToDecrypt += decryptMessage(index + 2, message, memoize);
        }

        memoize.put(index, waysToDecrypt);
        return waysToDecrypt;
    }

}
