package GreedyAlgos;

public class PopsicleStand {


    //You’re running a popsicle stand where each popsicle costs $5.
    // Each customer you encountered pays with either a $5 bill, a $10 bill, or a $20 bill and only buys a single popsicle.
    // the customers that come to your stand come in the ordered given by the customers array where customers[i]
    // represents the bill the ith customer pays with. Starting with $0,
    // return whether or not you can serve all the given customers while also giving the correct amount of change.
    public static void main(String[] args) {
        int[] people1 = {5, 10};
        int[] people2 = {10};
        int[] people3 = {5, 5, 5, 10, 20};

        System.out.println(popsicleStand(people1)); // true
        System.out.println(popsicleStand(people2)); // false
        System.out.println(popsicleStand(people3)); // true
    }

    // O(n)
    public static boolean popsicleStand(int[] customers) {
        int fives = 0;
        int tens = 0;
        for (int customer : customers) {
            if (customer == 5) {
                fives++;
            } else if (customer == 10 && fives == 0) {
                return false;
            } else if (customer == 10) {
                fives--;
                tens++;
            } else if (fives > 0 && tens > 0) {
                fives--;
                tens--;
            } else if (fives >= 3) {
                fives -= 3;
            } else {
                return false;
            }
        }

        return true;
    }
}
