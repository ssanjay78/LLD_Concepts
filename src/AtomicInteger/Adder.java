package AtomicInteger;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable{
    private Count count;
    private Lock lock;
    public Adder(Count count) {
        this.count = count;
//        this.lock = lock;

    }
    public void run(){
        for (int i=0; i<100000; i++){
//            lock.lock();
            count.value.addAndGet(i);
//            lock.unlock();
        }
    }
}
