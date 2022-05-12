package StacksAndQueues;

import java.util.Stack;

public class ValidateCharacters {

    public static void main(String[] args){
        System.out.println(validate("(){}[]")); // true
        System.out.println(validate( "(({[]}))")); // true
        System.out.println(validate("{(})")); // false
    }
    public static Boolean validate(String s){

        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){
            if(c == '('){
                stack.push(')');
            }
            else if(c == '{'){
                stack.push('}');
            }
            else if(c == '['){
                stack.push(']');
            }
            else if (stack.isEmpty() || c != stack.pop()){
                return false;
            }
        }

        return stack.isEmpty();
    }
}
