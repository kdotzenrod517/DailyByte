package AdvancedTopics;

public class IntegerToHex {

    public static void main(String[] args) {
        System.out.println(integerToHexadecimal(15)); // f
        System.out.println(integerToHexadecimal(46)); // 2e
    }

    // Runtime: O(logN) (base 16) where N is the num we’re given.
    // Space complexity: O(logN) (base 16) where N is the num we’re given.
    public static String integerToHexadecimal(int num){
        char[] characters = {
                '0',
                '1',
                '2',
                '3',
                '4',
                '5',
                '6',
                '7',
                '8',
                '9',
                'a',
                'b',
                'c',
                'd',
                'e',
                'f'
        };

        if (num == 0) {
            return characters[num] + "";
        }

        StringBuilder hex = new StringBuilder();
        while (num != 0) {
            hex.append(characters[(num & 15)]);
            num >>>= 4;
        }

        return hex.reverse().toString();
    }
}
