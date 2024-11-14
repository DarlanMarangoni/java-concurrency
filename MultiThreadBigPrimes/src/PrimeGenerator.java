import java.math.BigInteger;
import java.util.Random;

public class PrimeGenerator implements Runnable {

    private final Results results;

    public PrimeGenerator(Results results) {
        this.results = results;
    }

    @Override
    public void run() {
        BigInteger bigInteger = new BigInteger(2000, new Random());
        results.getPrimes().add(bigInteger.nextProbablePrime());
    }
}
