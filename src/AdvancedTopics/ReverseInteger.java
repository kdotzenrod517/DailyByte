package AdvancedTopics;

public class ReverseInteger {

    public static void main(String[] args){
        System.out.println(reverse(550)); // 55
        System.out.println(reverse(-37)); // -73
    }

    public static int reverse(int x) {

        long rev = 0;
        while(x != 0){
            rev = rev * 10 + x % 10;
            x = x/10;
            if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE){
                return 0;
            }
        }
        return (int) rev;
    }
}
