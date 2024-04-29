package CodeAlphaProject.HotelReservationSystem;

import java.util.Date;

public class Reservation {
    private Room room;
    private Date checkInDate;
    private Date checkOutDate;
    private String guestName;

    public Reservation(Room room, Date checkInDate, Date checkOutDate, String guestName) {
        this.room = room;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.guestName = guestName;
    }
}
