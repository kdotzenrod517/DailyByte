package AdvancedTopics;

import java.util.Arrays;

public class CountingPrimes {

    public static void main(String[] args) {
        System.out.println(countPrimesLessThanN(3)); // 1 - 2 is the only prime number less than 3.
        System.out.println(countPrimesLessThanN(7)); // 3 - 2, 3, and 5 are the only prime numbers less than 7.
    }

    public static int countPrimesLessThanN(int n) {
        boolean[] primes = new boolean[n];
        Arrays.fill(primes, true);

        for (int i = 2; i < Math.sqrt(n); i++) {
            if (primes[i]) {
                for (int j = i; j * i < primes.length; j++) {
                    primes[i * j] = false;
                }
            }
        }

        int primeCount = 0;
        for (int i = 2; i < primes.length; i++) {
            if (primes[i]) {
                primeCount++;
            }
        }

        return primeCount;
    }
}
