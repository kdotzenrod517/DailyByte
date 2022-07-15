package StacksAndQueues;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class ReverseVowels {

    public static void main(String[] args){
        System.out.println(reverseVowels("computer")); // cemputor
        System.out.println(reverseVowels("The Daily Byte")); // The Dialy Byte
    }

    // O(n)
    public static String reverseVowels(String s){

        Stack<Character> stack = new Stack<>();
        Set<Character> vowels = new HashSet<>();
        char[] chars = s.toCharArray();

        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

        for(char c : chars){
            if(vowels.contains(c)){
                stack.push(c);
            }
        }

        for(int i = 0; i < chars.length; i++){
            if(vowels.contains(chars[i])){
                chars[i] = stack.pop();
            }
        }

        return String.valueOf(chars);
    }
}
