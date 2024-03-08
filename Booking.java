import java.time.LocalDate;

public class Booking {
    private Customer customer;
    private Room room;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private int rentDuration;

    public Booking(Customer customer, Room room, LocalDate checkInDate, LocalDate checkOutDate, int rentDuration) {
        this.customer = customer;
        this.room = room;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.rentDuration = rentDuration;
    }


}
