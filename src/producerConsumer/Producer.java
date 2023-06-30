package producerConsumer;

import java.nio.channels.AsynchronousFileChannel;
import java.util.Queue;
import java.util.concurrent.locks.Lock;

public class Producer implements Runnable{
    Queue<Object> shirts;
    int maxSize;
    String name;
    Lock lock;
    public Producer(String name, Queue<Object> shirts, int maxSize, Lock lock){
        this.shirts = shirts;
        this.maxSize = maxSize;
        this.name = name;
        this.lock = lock;
    }

    public void run(){
        while (true) {
            lock.lock();
            if (shirts.size() < maxSize) {
                System.out.println(name + " is adding the object, size = " + shirts.size());
                shirts.add(new Object());
            }
            lock.unlock();
        }
    }
}
