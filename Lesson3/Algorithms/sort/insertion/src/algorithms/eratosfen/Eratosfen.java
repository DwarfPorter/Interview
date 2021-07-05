package algorithms.eratosfen;

import java.util.Arrays;

public class Eratosfen {

    public boolean[] primes;

    public Eratosfen(int range) {
        primes = new boolean[range + 1];
    }

    public void fillSieve() {
        Arrays.fill(primes, true);

        primes[0] = false;
        primes[1] = false;
        
        for (int i = 2; i < primes.length; ++i) {
            if (primes[i]) {
                for (int j = 2; i * j < primes.length; ++j) {
                    primes[i * j] = false;
                }
            }
        }
    }

    public void displayAllNumbers() {
        fillSieve();
        for (int i = 0; i < primes.length; i++) {
            if (primes[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
