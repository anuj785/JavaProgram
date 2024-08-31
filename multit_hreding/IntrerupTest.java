package multit_hreding;

public class IntrerupTest extends Thread {

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(i);

            }
        } catch (Exception e) {
            System.out.println("Thread Interrupted" + e);
        }
    }

    public static void main(String[] args) {

        IntrerupTest t = new IntrerupTest();

        t.start();
        t.interrupt();
    }

}
