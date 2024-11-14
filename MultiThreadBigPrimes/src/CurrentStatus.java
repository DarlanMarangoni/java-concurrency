public class CurrentStatus implements Runnable {

    private final Results results;

    public CurrentStatus(Results results) {
        this.results = results;
    }

    @Override
    public void run() {
        while (results.getPrimes().size() < MultiThreadBigPrimes.THREAD_SIZE) {
            System.out.println("Got " + results.getPrimes().size() + " so far...");
            results.getPrimes().forEach(System.out::println);
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
