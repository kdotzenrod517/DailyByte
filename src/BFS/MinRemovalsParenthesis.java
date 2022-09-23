package BFS;

import java.util.*;

public class MinRemovalsParenthesis {

    public static void main(String[] args){
        System.out.println(minimumRemovals("(()()()")); // ["()()()","(())()","(()())"]
        System.out.println(minimumRemovals("()()()")); // ["()()()"]
    }

    // Runtime: O(N x 2N) where N is the total number of characters in s.
    // Space complexity: O(N x 2N) where N is the total number of characters in s.
    public static List<String> minimumRemovals(String s) {
        List<String> result = new ArrayList<>();
        if(s == null) {
            return result;
        }

        Queue<String> queue = new LinkedList<>();
        HashSet<String> visited = new HashSet<>();
        queue.add(s);
        visited.add(s);
        boolean found = false;
        while(!queue.isEmpty()) {
            s = queue.remove();
            if(isValid(s)) {
                result.add(s);
                found = true;
            }

            if(found) {
                continue;
            }

            for(int i = 0; i < s.length(); i++) {
                char current = s.charAt(i);
                if(current != '(' && current != ')') {
                    continue;
                }

                String next = s.substring(0, i) + s.substring(i + 1);
                if(!visited.contains(next)) {
                    queue.add(next);
                    visited.add(next);
                }
            }
        }

        return result;
    }

    public static boolean isValid(String s) {
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if(current == '(') {
                count++;
            } else if(current == ')' && count-- <= 0) {
                return false;
            }
        }

        return count == 0;
    }
}
