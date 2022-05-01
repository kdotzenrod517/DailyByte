package hashmap;

public class FindTheDifference {

    public static void main(String[] args) {
        System.out.println(findTheDifference("foobar", "barfoot")); // t
        System.out.println(findTheDifference("ide", "idea")); // a
        System.out.println(findTheDifference("coding", "ingcod")); //
    }

    public static char findTheDifference(String s, String t) {
        int[] count = new int[26];
        char[] S = s.toCharArray();
        char[] T = t.toCharArray();

        for(char c : S) count[c - 'a']++;
        for(char c : T) count[c - 'a']--;

        for(int i = 0; i < 26; i++){
            if(count[i] != 0){
                return (char) (i + 'a');
            }
        }

        return ' ';
    }
}
