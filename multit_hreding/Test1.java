package multit_hreding;

public class Test1 extends Thread {
    // public static void main(String[] args) {
    // for (int i = 1; i <= 5; i++) {
    // try {
    // Thread.sleep(1000);
    // System.out.println(i);
    // } catch (Exception e) {
    // System.out.println(e);
    // }

    // }
    // }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(i + ":" + Thread.currentThread().getName());
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        Test1 t1 = new Test1();
        t1.start();
        Test1 t2 = new Test1();
        t2.start();
    }
}
