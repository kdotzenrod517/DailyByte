package strings;

public class StringValidity {

    // Given a string s that contains only the following characters: (, ), and *,
    // where asterisks can represent either an opening or closing parenthesis,
    // return whether the string can form a valid set of parentheses
    public static void main(String[] args){
        System.out.println(checkValidity("*)")); // true
        System.out.println(checkValidity("(**)")); // true
        System.out.println(checkValidity("((*")); // false
    }

    // Runtime: O(N) where N is the total number of characters in s.
    // Space complexity: O(1) or constant.
    public static boolean checkValidity(String s){

        int low = 0;
        int high = 0;

        for(Character c : s.toCharArray()){
            low += c == '(' ? 1 : -1;
            high += c != ')' ? 1 : -1;

            if(high < 0) break;

            low = Math.max(low, 0);
        }

        return low == 0;
    }
}
