package threads.pkg1.exercise4;

public class Turnstile implements Runnable {

    private final TurnstileCounterLock counter;
    private int count;

    final int COUNT_MAX = 1000;

    Turnstile(TurnstileCounterLock c) {
        counter = c;
    }

    public int getCount() {
        return count;
    }

    @Override
    public void run() {
        for (int i = 0; i < COUNT_MAX; i++) {
            counter.incr();
            count++;
        }
    }

}
