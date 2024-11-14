import java.math.BigInteger;
import java.util.Random;
import java.util.TreeSet;

public class SingleThreadBigPrimes {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        TreeSet<BigInteger> primes = new TreeSet<>();

        while (primes.size() < 20) {
            BigInteger bigInteger = new BigInteger(2000, new Random());
            primes.add(bigInteger);
            System.out.println("The integer is " + bigInteger + ".");
            System.out.println("The next probable prime is " + bigInteger.nextProbablePrime() + ".");
        }

        System.out.println("Execution time: " + (System.currentTimeMillis() - start) + " ms.");
    }
}