import java.util.ArrayList;

public class MultiThreadBigPrimes {

    public static final int THREAD_SIZE = 1000;

    public static void main(String[] args) throws InterruptedException {

        long start = System.currentTimeMillis();

        Results results = new Results();
        Runnable task = new PrimeGenerator(results);

        Runnable status = new CurrentStatus(results);
        Thread statusTask = new Thread(status);
        statusTask.start();

        ArrayList<Thread> threads = new ArrayList<>();

        for (int i = 0; i < THREAD_SIZE; i++) {
            Thread t = new Thread(task);
            threads.add(t);
            t.start();
        }

        for (Thread t : threads) {
            t.join();
        }

        results.print();

        System.out.println("Execution time: " + (System.currentTimeMillis() - start) + " ms.");
    }
}