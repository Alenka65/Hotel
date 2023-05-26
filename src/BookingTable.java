import java.util.ArrayList;
import java.util.List;

public class BookingTable {
    private List<Booking> bookings = new ArrayList<>();

    public List<Booking> getBookings() {
        return bookings;
    }

    public void addBooking(Booking booking) {
        bookings.add(booking);
    }

    @Override
    public String toString() {
        return "BookingTable{" +
                "bookings=" + bookings +
                '}';
    }
}





