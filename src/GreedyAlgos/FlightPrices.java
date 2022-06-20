package GreedyAlgos;

import java.util.Arrays;
import java.util.Comparator;

public class FlightPrices {


    // People have given choices to fly either to cityA OR to cityB. But they have to book their flight's by themself.
    //Now, everyone will choose that city which is cheapest to visit and they'll book the flight ticket according to that city.
    //Return the minimum cost to fly every person to a city such that exactly n people arrive in each city.
    public static void main(String[] args) {
        int[][] prices = {{40, 30}, {300, 200}, {50, 50}, {30, 60}};

        System.out.println(twoCitySchedCost(prices)); // 310
    }

    // Time Complexity : O(NlogN)
    //Space Complexity : O(1)
    public static int twoCitySchedCost(int[][] costs) {
        // sort on basis of absolute diff of cities
        Arrays.sort(costs, Comparator.comparingInt(a -> (a[0] - a[1])));

        // hold answer
        int price = 0;

        // length of array. i.e. n
        int n = costs.length;

        // iterate half time
        for (int i = 0; i < n / 2; i++) {

            // add 0th index element of first half and 1st index element of second half
            price += costs[i][0] + costs[i + n / 2][1];
        }

        // return answer
        return price;
    }
}
