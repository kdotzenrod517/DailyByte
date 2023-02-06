package strings;

public class BrokenKeyboard {

    public static void main(String[] args) {
        System.out.println(brokenKeyboard("kevin", "kkevin")); // true
        System.out.println(brokenKeyboard("timmy", "timmm")); // false
    }

    // Runtime: O(N + M) where N is the total number of characters in name and M is the total number of characters in typed.
    // Space complexity: O(1) or constant.
    public static boolean brokenKeyboard(String name, String typed){
        int index = 0;
        for(int i = 0; i < typed.length(); i++){
            if(index < name.length() && name.charAt(index) == typed.charAt(i)){
                index++;
            } else if (i == 0 || typed.charAt(i) != typed.charAt(i - 1)){
                return false;
            }
        }

        return index == name.length();

    }
}
