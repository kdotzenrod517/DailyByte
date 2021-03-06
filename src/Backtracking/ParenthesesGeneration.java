package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class ParenthesesGeneration {

    // Given an integer N, where N represents the number of pairs of parentheses
    // (i.e. ”(“ and ”)”) you are given, return a list containing all possible well-formed parentheses you can create.
    public static void main(String[] args){
        System.out.println(generateParenthesis(3));
        //  [
        //    "((()))",
        //  "(()())",
        //  "(())()",
        //  "()(())",
        //  "()()()"
        //]
    }

    // Runtime: O(2^2N) where N is the total number of pairs of parentheses we are given at the beginning of the problem.
    // This results from having at most two choices during each recursive call
    // (adding an opening parenthesis to the current string builder and adding a closing parenthesis
    // to the current string builder) with our recursive calls reading a depth of at most N * 2.

    // Space complexity: O(N) where N is the total number of pairs of parentheses we are
    // given at the beginning of the problem (Note that the runtime is not O(2N) because
    // constants are dropped in big-o notation).
    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generateValidParentheses(result, new StringBuilder(), 0, 0, n);

        return result;
    }

    public static void generateValidParentheses(List<String> result, StringBuilder current, int open, int close, int n) {
        if(current.length() == n * 2) {
            result.add(current.toString());
            return;
        }

        if(open < n) {
            current.append("(");
            generateValidParentheses(result, current, open + 1, close, n);
            current.deleteCharAt(current.length() - 1);
        }

        if(close < open) {
            current.append(")");
            generateValidParentheses(result, current, open, close + 1, n);
            current.deleteCharAt(current.length() - 1);
        }
    }
}
