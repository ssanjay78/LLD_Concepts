package ProdConsSemaphores;

import java.util.Queue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;

public class Consumer implements Runnable{
    Queue<Object> shirts;
    int maxSize;
    String name;
    Lock lock;
    Semaphore p;
    Semaphore c;
    public Consumer(String name, Queue<Object> shirts, int maxSize, Semaphore p, Semaphore c){
        this.shirts = shirts;
        this.maxSize = maxSize;
        this.name = name;
//        this.lock = lock;
        this.p = p;
        this.c = c;
    }

    public void run(){
        while (true) {
//            lock.lock();
            try {
                c.acquire();
                if (shirts.size() > 0) {
                    System.out.println(name + " is removing the object, size = " + shirts.size());
                    shirts.remove();
                }
                p.release();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
//            lock.unlock();
        }
    }
}
