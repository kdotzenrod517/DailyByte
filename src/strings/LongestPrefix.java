package strings;

public class LongestPrefix {

    public static void main(String[] args) {
        String[] col = new String[]{"colorado", "color", "cold"};
        String[] none = new String[]{"a", "b", "c"};
        String[] spot = new String[]{"spot", "spotty", "spotted"};
        System.out.println(prefix(col));
        System.out.println(prefix(none));
        System.out.println(prefix(spot));
    }
    public static String prefix(String[] strs) {

        if(strs.length == 0) return "";
        String prefix = strs[0];

        for(int i = 1; i < strs.length; i++){
            while(strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length() - 1);
                if(prefix.isEmpty()) return "";
            }
        }

        return prefix;
    }
}


