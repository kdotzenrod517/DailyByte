package BinarySearch;

public class NextLetter {

    public static void main(String[] args) {
        System.out.println(nextLetter(new char[]{'a', 'b', 'c'}, 'b')); // c
        System.out.println(nextLetter(new char[]{'r', 'y'}, 'z')); // r
    }

    // Runtime: O(logN) where N is the number of elements in letters.
    // Space complexity: O(1) or constant.
    private static char nextLetter(char[] chars, char target) {
        int l = 0;
        int r = chars.length;

        while(l < r){
            int mid = (l + r) / 2;

            if(chars[mid] <= target){
                l = mid + 1;
            } else {
                r = mid;
            }
        }

        // return the character
        // within letters at our left pointer modded by our letters’ length
        return chars[l % chars.length];
    }
}
