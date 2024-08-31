package multit_hreding;

public class MovieBookApp extends Thread {

    static BookTheaterSeat b;
    int seats;

    public void run() {
        b.bookSeat(seats);
        // System.out.println(Thread.currentThread());
    }

    public static void main(String[] args) {
        b = new BookTheaterSeat();
        MovieBookApp anuj = new MovieBookApp();
        anuj.seats = 6;
        anuj.start();

        MovieBookApp rb = new MovieBookApp();
        rb.seats = 5;
        rb.start();

    }
}
