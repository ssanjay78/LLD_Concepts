package syncKeyword;

public class Subtracter implements Runnable{
    private Count count;
    public Subtracter(Count count) {
        this.count = count;

    }
    public void run(){
        for (int i=0; i<100000; i++){
            synchronized (count) {
                count.value -= i;
            }
        }
    }
}
