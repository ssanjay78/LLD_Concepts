package syncKeyword;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Count cc = new Count();
        Adder adder = new Adder(cc);
        Subtracter subtracter = new Subtracter(cc);

        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(subtracter);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(cc.value);
    }
}
