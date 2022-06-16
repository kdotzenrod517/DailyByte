package GreedyAlgos;

import java.util.Arrays;

public class LifeRafts {

    public static void main(String[] args) {
        int[] people1 = {1, 3, 5, 2};
        int[] people2 = {1, 2};
        int[] people3 = {4, 2, 3, 3};

        System.out.println(numRescueBoats(people1, 5)); // 3
        System.out.println(numRescueBoats(people2, 3)); // 1
        System.out.println(numRescueBoats(people3, 5)); // 3
    }

    // O(nlogn) where n is the length of people
    public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);

        int i = 0;
        int j = people.length - 1;
        int ans = 0;

        while (i <= j) {
            ans++;
            if (people[i] + people[j] <= limit)
                i++;
            j--;
        }

        return ans;
    }
}
