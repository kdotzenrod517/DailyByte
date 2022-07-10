package AdvancedTopics;

public class ComplementaryNumber {

    // Given a positive number, return its complementary number.
    //Note: The complement of a number is the number that results from
    // flipping every bit in the original number. (i.e. zero bits become one bits and one bits become zero bits).
    public static void main(String[] args){
        System.out.println(complementaryNumber(27)); // 4, 27 in binary (not zero extended) is 11011. Therefore, the complementary binary is 00100 which is 4.
    }

    public static int complementaryNumber(int number) {
        int result = 0;
        int power = 1;
        while(number > 0) {
            result += power * ((number % 2) ^ 1);
            power <<= 1;
            number >>= 1;
        }

        return result;
    }
}
