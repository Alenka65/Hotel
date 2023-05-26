import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Booking {
    private LocalDate startDate;
    private LocalDate endDate;
    private VacationType vacationType;
    private List<Guest> guests = new ArrayList<>();
    private Room room;

    public Booking(LocalDate startDate, LocalDate endDate, VacationType vacationType, Guest guest, Room room) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.vacationType = vacationType;
        this.guests.add(guest);
        this.room = room;
    }

    public Booking(LocalDate startDate, LocalDate endDate, VacationType vacationType, List<Guest> guests, Room room) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.vacationType = vacationType;
        this.guests = guests;
        this.room = room;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "startDate=" + startDate +
                ", endDate=" + endDate +
                ", vacationType=" + vacationType +
                ", guests=" + guests +
                ", room=" + room +
                '}';
    }
}
