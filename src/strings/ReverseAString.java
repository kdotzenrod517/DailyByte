package strings;

public class ReverseAString {

    public static void main(String[] args){

        System.out.println(reverseAString("Cat"));
        System.out.println(reverseAString("The Daily Byte"));
        System.out.println(reverseAString("civic"));
    }

    // O(n)
    public static String reverseAString(final String s){
        char[] chars = new char[s.length()];
        int j = 0;
        for(int i = s.length() - 1; i >= 0; i--){
            chars[j++] = s.charAt(i);
        }
        return String.valueOf(chars);
    }
}
