package threads.pkg1.exercise4;

import java.util.concurrent.locks.ReentrantLock;

public class TurnstileCounterLock {

    static final long DELAY_VAL = 10000;
    private final ReentrantLock lock = new ReentrantLock();
    long count = 0;

    public long getValue() {
        return count;
    }

    public void incr() {
//   If the program initially does not fail, replace the count line with the lines below
//    long n = count;
//    //Spend some time to force preemtion
//    for(long a=0; a<LockDemo.DELAY_VAL; a++);
//    n = n + 1;
//    count = n;

        lock.lock();  // block until condition holds
        try {
            count++;
        } finally {
            lock.unlock();
        }
    }
}
