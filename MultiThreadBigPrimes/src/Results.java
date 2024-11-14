import java.math.BigInteger;
import java.util.SortedSet;
import java.util.TreeSet;

public class Results {

    private final SortedSet<BigInteger> primes;

    public Results() {
        this.primes = new TreeSet<>();
    }

    public SortedSet<BigInteger> getPrimes() {
        return primes;
    }
}
