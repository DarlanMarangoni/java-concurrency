public class CurrentStatus implements Runnable {

    private final Results results;

    public CurrentStatus(Results results) {
        this.results = results;
    }

    @Override
    public void run() {
        while (results.getSize() < MultiThreadBigPrimes.THREAD_SIZE) {
            System.out.println("Got " + results.getSize() + " so far...");
            results.print();
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
