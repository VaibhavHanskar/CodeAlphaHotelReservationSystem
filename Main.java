package CodeAlphaProject.HotelReservationSystem;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Create a hotel reservation system with 10 rooms
        HotelReservationSystem reservationSystem = new HotelReservationSystem("Narayan Lodge" , 10);

        // Make a reservation for a guest named "John Doe" from May 1st to May 3rd
        Date checkInDate = new Date(121, 4, 1); // Note: Date constructor is deprecated, consider using Calendar or LocalDate
        Date checkOutDate = new Date(121, 4, 3);
        reservationSystem.makeReservation(checkInDate, checkOutDate, "John Doe");

        // Make another reservation for a guest named "Jane Smith" from May 5th to May 7th
        checkInDate = new Date(121, 4, 5);
        checkOutDate = new Date(121, 4, 7);
        reservationSystem.makeReservation(checkInDate, checkOutDate, "Jane Smith");

        // Attempt to make a reservation for a guest named "Alice Johnson" from May 2nd to May 4th
        checkInDate = new Date(121, 4, 2);
        checkOutDate = new Date(121, 4, 4);
        reservationSystem.makeReservation(checkInDate, checkOutDate, "Alice Johnson");
    }
}
