package multit_hreding;

public class Test3 extends Thread {

    public void run() {
        // System.out.println(Thread.interrupted()); // true -> false change the state
        // true to false
        // System.out.println(Thread.currentThread().isInterrupted()); // true -> true
        // not changes the true state
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(i);
                Thread.sleep(1000);
                // System.out.println(Thread.interrupted());
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Test3 t3 = new Test3();
        t3.start();
        t3.interrupt();
    }
}
