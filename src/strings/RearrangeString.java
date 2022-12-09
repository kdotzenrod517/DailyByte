package strings;

public class RearrangeString {

    public static void main(String[] args) {
        // return "cba" ('a' moves to the 2nd index,
        // b stays at the first index, and c moves to the zeroth index).
        System.out.println(rearrangeString("abc", new int[] {2, 1, 0}));
    }

    // Runtime: O(N) where N is the total number of characters in s.
    // Space complexity: O(N) where N is the total number of characters in s.
    public static String rearrangeString(String s, int[] indices){
        char[] chars = new char[s.length()];
        for(int i = 0; i < indices.length; i++){
            chars[indices[i]] = s.charAt(i);
        }
        return String.valueOf(chars);
    }
}
