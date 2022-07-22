package strings;

public class DefangIPAddress {

    public static void main(String[] args) {
        System.out.println(defangIP("127.0.0.1")); // "127[.]0[.]0[.]1"
    }

    // Runtime: O(N) where N is the total number of characters in our IP address
    // (one could also say that this is a constant runtime assuming that there is
    // some standard maximum length to an IP address).

    // Space complexity: O(N) where N is the total number of characters in our IP address.
    // This results from creating a string builder with N characters.
    // (one could also say that this is a constant runtime assuming that there is
    // some standard maximum length to an IP address).

    public static String defangIP(String address) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            char current = address.charAt(i);
            if (current == '.') {
                result.append("[.]");
            } else {
                result.append(current);
            }
        }

        return result.toString();
    }
}
