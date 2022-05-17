package StacksAndQueues;

public class RemoveAdjacentDuplicates {

    public static void main(String[] args){
        System.out.println(removeDuplicates("abccba")); //
        System.out.println(removeDuplicates("foobar")); // fbar
        System.out.println(removeDuplicates("abccbefggfe")); // a
    }

    // O(n)
    public static String removeDuplicates(String S) {
        StringBuilder sb = new StringBuilder();
        for (char c : S.toCharArray()) {
            int size = sb.length();
            if (size > 0 && sb.charAt(size - 1) == c) {
                sb.deleteCharAt(size - 1);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
