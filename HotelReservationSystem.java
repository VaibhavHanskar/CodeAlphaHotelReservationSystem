package CodeAlphaProject.HotelReservationSystem;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HotelReservationSystem {
    private Hotel hotel;
    private List<Reservation> reservations;

    public HotelReservationSystem(String name,int numRooms) {
        hotel = new Hotel(name,numRooms);
        reservations = new ArrayList<>();
    }

    public void makeReservation(Date checkInDate, Date checkOutDate, String guestName) {
        Room availableRoom = hotel.findAvailableRoom();
        if (availableRoom != null) {
            availableRoom.bookRoom();
            Reservation reservation = new Reservation(availableRoom, checkInDate, checkOutDate, guestName);
            reservations.add(reservation);
            System.out.println("Reservation successful. Room " + availableRoom.getRoomNumber() + " booked for " + guestName);
        } else {
            System.out.println("Sorry, no available rooms for the selected dates.");
        }
    }
}
