package AdvancedTopics;

public class SoupOrSalad {

    public static void main(String[] args) {
        System.out.println(soupOrSalad(new int[]{1, 1, 1}, new int[]{1, 1, 1})); // return 0 (all customers' preferences were satisfied, they all received salad).
        System.out.println(soupOrSalad(new int[]{1, 0, 1}, new int[]{0, 0, 1})); // return 2 (first customer passes on the available soup, second customer takes the soup, then neither remaining customer wants the second soup).
    }

    // Runtime: O(N) where N is the total number of elements in customers.
    // Space complexity: O(1) or constant.
    public static int soupOrSalad(int[] customers, int[] sides) {
        int[] counts = {0, 0};
        for (int i = 0; i < customers.length; i++) {
            counts[customers[i]] += 1;
        }

        int i = 0;
        while (i < sides.length) {
            if (counts[sides[i]] > 0) {
                counts[sides[i]] -= 1;
            } else {
                break;
            }

            i += 1;
        }

        return sides.length - i;
    }
}
