package CodeAlphaProject.HotelReservationSystem;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String name;
    private List<Room> rooms;

    public Hotel(String name , int numRooms) {
        this.name = name;
        rooms = new ArrayList<>();
        for (int i = 1; i <= numRooms; i++) {
            rooms.add(new Room(i));
        }
    }

    public Room findAvailableRoom() {
        for (Room room : rooms) {
            if (room.isAvailable()) {
                return room;
            }
        }
        return null; // No available room found
    }


}
