package strings;

public class CompressString {

    // Given a character array, compress it in place and return the new length of the array.
    public static void main(String[] args) {
        System.out.println(compress(new char[]{'a', 'a', 'a', 'a', 'a', 'a'})); // 2, ['a', '6']
        System.out.println(compress(new char[]{'a', 'a', 'b', 'b', 'c', 'c'})); // 6, ['a', '2', 'b', '2', 'c', '2']
        System.out.println(compress(new char[]{'a', 'b', 'c'})); // 3, no compression
    }

    // Runtime: O(N) where N is the total number of character in chars.
    // Space complexity: O(1) or constant since we compress our array in-place.
    public static int compress(char[] chars) {

        int index = 0;
        int i = 0;

        while(i < chars.length){
            int j = i;

            while(j < chars.length && chars[j] == chars[i]){
                j++;
            }

            chars[index++] = chars[i];

            if(j - i > 1){
                String count = j - i + "";
                for(char c : count.toCharArray()){
                    chars[index++] = c;
                }
            }

            i = j;
        }

        return index;
    }
}
