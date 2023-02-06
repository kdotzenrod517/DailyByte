package strings;

public class CheckStrings {

    public static void main(String[] args) {
        System.out.println(checkStrings(new String[]{"abc", "d"}, new String[]{"ab", "cd"})); // true
        System.out.println(checkStrings(new String[]{"a", "b", "c"}, new String[]{"a", "b", "d"})); // false
    }

    // Runtime: O(N) where N is the total number of characters within words1 and words2.
    // Space complexity: O(1) or constant.
    public static boolean checkStrings(String[] word1, String[] word2){
        int i = 0;
        int j = 0;
        int w1 = 0;
        int w2 = 0;

        while(w1 < word1.length && w2 < word2.length){
            if(word1[w1].charAt(i) != word2[w2].charAt(j)){
                return false;
            }

            if(i == word1[w1].length() - 1){
                i = 0;
                w1++;
            } else {
                i++;
            }

            if(j == word2[w2].length() - 1){
                j = 0;
                w2++;
            } else {
                j++;
            }
        }

        return w1 == word1.length && w2 == word2.length;
    }
}
