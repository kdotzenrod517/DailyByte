package strings;

public class MinNumberSubSequence {

    public static void main(String[] args){
        System.out.println(formString("abd", "def")); // -1
        System.out.println(formString("abcdef", "abcadaef")); // 3
    }

    // Runtime: O(N * M) where N is the total number of characters in source and M is the total number of characters in target.
    // Space complexity: O(1) or constant.
    public static int formString(String source, String target){
        int count = 0;
        int index = 0;
        while(index < target.length()){
            int curr = index;

            for(int s = 0; s < source.length(); s++){
                if(index != target.length() && source.charAt(s) == target.charAt(index)){
                    index++;
                }
            }

            if(index == curr){
                return -1;
            }
            count++;
        }

        return count;
    }
}
