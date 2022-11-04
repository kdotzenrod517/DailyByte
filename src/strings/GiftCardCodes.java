package strings;

public class GiftCardCodes {

    public static void main(String[] args){
        System.out.println(generate("49DkeDb39LXI", 3)); // 49D-KED-B39-LXI
        System.out.println(generate("9Dklsi3nsEKE92", 3)); // 9D-KLS-I3N-SEK-E92
    }

    // Runtime: O(N) where N is the total number of characters in S.
    // Space complexity: O(N) where N is the total number of characters in S.
    public static String generate(String s, int k){
        StringBuilder sb = new StringBuilder();
        int count = 0;
        int i = s.length() - 1;

        while(i >= 0){
            char current = Character.toUpperCase(s.charAt(i));
            if(current == '-'){
                i--;
            } else if (count == k){
                sb.append('-');
                count = 0;
            } else {
                sb.append(current);
                count++;
                i--;
            }
        }

        return sb.reverse().toString();
    }
}
