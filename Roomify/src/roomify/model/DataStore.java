package roomify.model;
import java.util.LinkedList;
import roomify.model.roomlisting;




/**
 *
 * @author psychmist
 */
public class DataStore {
     // Arrays (fixed-size demo storage)
    public static final int MAX_USERS = 50;
    public static final user[] users = new user[MAX_USERS];
    public static int userCount = 0;

    // LinkedList for later (requests, listings etc.)
public static LinkedList<Request> requests = new LinkedList<>();
public static LinkedList<roomlisting> pendingListings = new LinkedList<>();

public static int nextListingId = 1;
public static int nextRequestId = 1;

    private static boolean seeded = false;

    public static void seed() {
        if (seeded) return;

        // Demo users 
        addUser(new user("admin", "admin123", "Admin"));
        addUser(new user("member", "member123", "Member"));
        addRoom(new Room(1, "Kathmandu", 32000, 2, "Available"));
        addRoom(new Room(2, "Melbourne", 2800, 1, "Available"));
        addRoom(new Room(3, "Newcastle", 25000, 4, "Unavailable"));
        DataStore.requests.add(new Request(DataStore.nextRequestId++, "member", 1, "Pending"));
        DataStore.requests.add(new Request(DataStore.nextRequestId++, "member", 2, "Pending"));
        DataStore.requests.add(new Request(DataStore.nextRequestId++, "admin", 3, "Approved"));
        pendingListings.add(new roomlisting(nextListingId++, "member", "Chitwan", 400, 2, true, "Pending"));



        seeded = true;
    }

    public static boolean addUser(user u) {
        if (userCount >= MAX_USERS) return false;
        users[userCount++] = u;
        return true;
    }
    public static final int MAX_ROOMS = 50;
public static Room[] rooms = new Room[MAX_ROOMS];
public static int roomCount = 0;

public static void addRoom(Room r) {
    rooms[roomCount++] = r;
}
public static Room findRoomById(int id) {
    for (int i = 0; i < roomCount; i++) {
        if (rooms[i].roomId == id) return rooms[i];
    }
    return null;
}
public static user findUserByUsername(String username) {
    if (username == null) return null;

    for (int i = 0; i < userCount; i++) {
        user u = users[i];
        if (u != null && u.getUsername() != null
                && u.getUsername().equalsIgnoreCase(username)) {
            return u;
        }
    }
    return null;
}

}
