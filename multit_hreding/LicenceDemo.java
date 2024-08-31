package multit_hreding;

class Medical extends Thread {

    public void run() {
        try {
            System.out.println("Medical start");
            Thread.sleep(3000);
            System.out.println("Medical Completed");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class TestDrive extends Thread {
    public void run() {
        try {
            System.out.println("Test Drive start");
            Thread.sleep(5000);
            System.out.println("Test Drive Completed");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class OfficerSign extends Thread {
    public void run() {
        try {
            System.out.println("Officer Takes file ");
            Thread.sleep(3000);
            System.out.println("Officer work completed");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class LicenceDemo {
    public static void main(String[] args) throws InterruptedException {
        Medical m = new Medical();
        m.start();

        m.join();

        TestDrive td = new TestDrive();
        td.start();

        td.join();

        OfficerSign os = new OfficerSign();
        os.start();

        os.join();
    }
}
