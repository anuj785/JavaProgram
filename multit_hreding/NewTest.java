package multit_hreding;

public class NewTest extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getPriority());
        System.out.println("child thread");

    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getPriority());
        NewTest t1 = new NewTest();
        t1.start();
        t1.setPriority(MIN_PRIORITY);
        ;
    }
}
