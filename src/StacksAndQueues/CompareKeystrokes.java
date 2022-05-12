package StacksAndQueues;

import java.util.Stack;

public class CompareKeystrokes {

    public static void main(String[] args) {
        System.out.println(compareKeystrokes("ABC#").equals(compareKeystrokes("CD##AB"))); // true
        System.out.println(compareKeystrokes("como#pur#ter").equals(compareKeystrokes("computer"))); // true
        System.out.println(compareKeystrokes("cof#dim#ng").equals(compareKeystrokes("code"))); // false
    }

    public static String compareKeystrokes(String s1) {
        Stack<Character> resp = new Stack<>();
        for (Character c : s1.toCharArray()) {
            if (c != '#') {
                resp.push(c);
            } else if (!resp.isEmpty()) {
                resp.pop();
            }
        }
        return String.valueOf(resp);
    }
}
