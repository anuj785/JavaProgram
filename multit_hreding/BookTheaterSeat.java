package multit_hreding;

public class BookTheaterSeat {

    int total_seats = 10;

    synchronized void bookSeat(int seats) {

        System.out.println("  hi " + Thread.currentThread().getName());
        System.out.println("  hi " + Thread.currentThread().getName());
        System.out.println("  hi " + Thread.currentThread().getName());
        System.out.println("  hi " + Thread.currentThread().getName());
        System.out.println("  hi " + Thread.currentThread().getName());

        synchronized (this) {
            if (total_seats >= seats) {
                System.out.println(seats + " Seats Booked succesFully");
                total_seats = total_seats - seats;
                System.out.println(" Seats left " + total_seats);
            } else {
                System.out.println("Seats can not be booked");
                System.out.println("Seats left " + total_seats);
            }
        }

        System.out.println("  hi " + Thread.currentThread().getName());
        System.out.println("  hi " + Thread.currentThread().getName());
        System.out.println("  hi " + Thread.currentThread().getName());
        System.out.println("  hi " + Thread.currentThread().getName());
        System.out.println("  hi " + Thread.currentThread().getName());
    }
}
