package multit_hreding;

public class Test2 extends Thread {
    static Thread t1;

    public void run() {
        try {
            t1.join();
            for (int i = 1; i <= 5; i++) {
                System.out.println("child thread : " + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        // System.out.println("Main Method");
        t1 = Thread.currentThread();
        Test2 t = new Test2();
        t.start();
        // t.join();
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Main thread : " + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
