package strings;

public class IndexOf {

    public static void main(String[] args) {
        System.out.println(index("abc", "a")); // 0
        System.out.println(index("abc", "abcd")); // -1
    }

    // Runtime: O((N - M) * M) where N is the length of s and M is the length of t.
    // Space complexity: O(1) or constant.
    public static int index(String s, String t) {
        if (t.length() == 0) {
            return 0;
        }
        if (t.length() > s.length()) {
            return -1;
        }

        for (int i = 0; i < s.length() - t.length() + 1; i++) {
            int count = 0;
            for (int j = 0; j < t.length(); j++) {
                if (s.charAt(i + j) != t.charAt(j)) {
                    break;
                }
                count++;
            }

            if (count == t.length()) {
                return i;
            }
        }

        return -1;
    }

//    public static int index(String s, String t) {
//        return s.indexOf(t);
//    }
}
