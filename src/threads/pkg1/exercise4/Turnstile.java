package threads.pkg1.exercise4;

public class Turnstile implements Runnable {

    private final TurnstileCounter counter;
    private int count;

    final int COUNT_MAX = 1000;

    Turnstile(TurnstileCounter c) {
        counter = c;
    }

    public int getCount() {
        return count;
    }

    @Override
    public void run() {
        synchronized (counter) {
            for (int i = 0; i < COUNT_MAX; i++) {
                counter.incr();
                count++;
            }
        }
    }

}