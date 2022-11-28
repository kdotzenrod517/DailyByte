package strings;

public class NestedParentheses {

    public static void main(String[] args){
        System.out.println(parentheses("The(Daily)Byte")); // 1
        System.out.println(parentheses("The(Daily)Byte((Dot)Dev)")); // 2
    }

    // Runtime: O(N) where N is the total number of characters in s.
    // Space complexity: O(1) or constant.
    public static int parentheses(String s){
        int max = 0;
        int depth = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                max = Math.max(max, ++depth);
            }
            if(s.charAt(i) == ')'){
                depth--;
            }
        }

        return max;
    }
}
