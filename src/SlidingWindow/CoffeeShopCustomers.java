package SlidingWindow;

public class CoffeeShopCustomers {

    public static void main(String[] args) {
        System.out.println(coffeeShopCustomers(new int[]{3, 1, 2}, new int[]{1, 0, 0}, 1)); // return 6 (the barista can remain calm for the first minute making all the customers happy 3 + 1 + 2 = 6).
        System.out.println(coffeeShopCustomers(new int[]{5, 2, 4, 3}, new int[]{1, 1, 0, 1}, 2)); //  return 11 (5 + 2 + 4).
    }

    // Runtime: O(N) where N is the total number of elements in customers.
    // Space complexity: O(1) or constant.
    public static int coffeeShopCustomers(int[] customers, int[] stressed, int duration) {
        int total = 0;
        int unhappy = 0;
        int converted = 0;
        int max = 0;
        for (int i = 0; i < customers.length; i++) {
            total += customers[i];
            unhappy += customers[i] * stressed[i];
            converted += customers[i] * stressed[i];
            if (i > duration - 1) {
                converted -= customers[i - duration] * stressed[i - duration];
            }
            max = Math.max(converted, max);
        }

        return total - unhappy + max;
    }
}
