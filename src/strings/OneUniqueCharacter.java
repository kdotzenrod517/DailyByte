package strings;

public class OneUniqueCharacter {

    public static void main(String[] args) {
        System.out.println(uniques("aabca")); // return 6 ("a" appears 3 times, "aa" appears 1 time, "b" appears 1 time, and "c" appears 1 time).
    }

    // Runtime: O(N) where N is the total number of characters in s.
    // Space complexity: O(1) or constant.
    public static int uniques(String s){
        int count = 0;
        int sum  = 0;

        for(int i = 0; i < s.length(); i++){
            if(i > 0 && s.charAt(i) == s.charAt(i - 1)){
                count++;
            } else {
                count = 1;
            }
            sum += count;
        }

        return sum;
    }
}
