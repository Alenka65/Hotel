import java.time.LocalDate;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Guest guest1 = new Guest("Adela", "Malikova", LocalDate.of(1993, 03,13));
        Guest guest2 = new Guest("Jana","Dvorackova", LocalDate.of(1995, 05,05));

        System.out.println(guest1);
        System.out.println(guest2);

        Room room1 = new Room(1,1,1000, true, true);
        Room room2 = new Room(2,1,1000, true, true);
        Room room3 = new Room(3,3,2400, false, true);

        System.out.println(room1);
        System.out.println(room2);
        System.out.println(room3);

        Booking booking1 = new Booking(LocalDate.of(2021, 07,19), LocalDate.of(2021, 07, 26), VacationType.BUSINESS, guest1, room1);
        Booking booking2 = new Booking(LocalDate.of(2021,9,1), LocalDate.of(2021,9,14),VacationType.PLEASURE, List.of(guest1,guest2), room3);


        BookingTable bookingTable1 = new BookingTable();
        bookingTable1.addBooking(booking1);
        bookingTable1.addBooking(booking2);

        System.out.println("First reservation: " + bookingTable1.getBookings().get(0));
        System.out.println("Second reservation: " + bookingTable1.getBookings().get(1));


    }
}