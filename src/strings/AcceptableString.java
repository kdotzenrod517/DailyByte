package strings;

public class AcceptableString {

    public static void main(String[] args) {
        System.out.println(acceptableString("Aabb")); // bb
        System.out.println(acceptableString("AabBcC")); //
    }

    // Runtime: O(N) where N is the total number of characters within s.
    // Space complexity: O(N) where N is the total number of characters within s.
    public static String acceptableString(String s) {
        var acceptable = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (acceptable.length() > 0 && Math.abs(acceptable.charAt(acceptable.length() - 1) - current) == 32) {
                acceptable.deleteCharAt(acceptable.length() - 1);
            } else {
                acceptable.append(current);
            }
        }

        return acceptable.toString();
    }
}
