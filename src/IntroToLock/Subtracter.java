package IntroToLock;

import java.util.concurrent.locks.Lock;

public class Subtracter implements Runnable{
    private Count count;
    private Lock lock;
    public Subtracter(Count count, Lock lock) {
        this.count = count;
        this.lock = lock;

    }
    public void run(){
        for (int i=0; i<100000; i++){
            lock.lock();
            count.value -= i;
            lock.unlock();
        }
    }
}
