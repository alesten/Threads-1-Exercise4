package threads.pkg1.exercise4;

import java.util.concurrent.atomic.AtomicInteger;

public class TurnstileCounterAtomic{

    static final long DELAY_VAL = 10000;
    AtomicInteger count = new AtomicInteger(0);

    public AtomicInteger getValue() {
        return count;
    }

    public void incr() {
//   If the program initially does not fail, replace the count line with the lines below
//    long n = count;
//    //Spend some time to force preemtion
//    for(long a=0; a<LockDemo.DELAY_VAL; a++);
//    n = n + 1;
//    count = n;

        count.addAndGet(1);
    }
}
