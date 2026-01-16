package roomify.model;

/**
 *
 * @author psychmist
 */
public class Room {
    public int roomId;
    public String location;
    public double price;
    public int occupants;
    public String availability;

    public Room(int roomId, String location, double price, int occupants, String availability) {
        this.roomId = roomId;
        this.location = location;
        this.price = price;
        this.occupants = occupants;
        this.availability = availability;
    }
}
