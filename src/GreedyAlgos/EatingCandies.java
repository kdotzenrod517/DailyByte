package GreedyAlgos;

public class EatingCandies {

    public static void main(String[] args) {
        System.out.println(eatingCandy(3, 3)); // return 4 (each your three candies, exchange 3 wrappers, each additional candy).
        System.out.println(eatingCandy(3, 4)); // 3
    }

    // Runtime: O(logN) where N is the total number of candies we’re given.
    // Space complexity: O(1) or constant.
    public static int eatingCandy(int candies, int exchange){
        int total = candies;

        while(candies >= exchange){
            total += (candies / exchange);
            candies = (candies / exchange) + (candies % exchange);
        }

        return total;
    }
}
