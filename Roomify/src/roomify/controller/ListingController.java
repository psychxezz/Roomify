package roomify.controller;
import roomify.model.DataStore;
import roomify.model.Room;
import roomify.model.roomlisting;
/**
 *
 * @author psychmist
 */
public class ListingController {
    public ListingController() {
        DataStore.seed();
    }

    public boolean submitListing(String username, String location, double price, int occupants, boolean isOwner) {
        roomlisting rl = new roomlisting(
                DataStore.nextListingId++,
                username,
                location,
                price,
                occupants,
                isOwner,
                "Pending"
        );
        DataStore.pendingListings.add(rl);
        return true;
    }

    public java.util.LinkedList<roomlisting> getPendingListings() {
        return DataStore.pendingListings;
    }

    public boolean approveListing(int listingId) {
        for (roomlisting rl : DataStore.pendingListings) {
            if (rl.listingId == listingId && rl.status.equals("Pending")) {
                rl.status = "Approved";

                // Create a public room from listing
                int newRoomId = DataStore.roomCount + 1;
                DataStore.addRoom(
    new Room(
        newRoomId,
        rl.location,
        rl.pricePerWeek,
        rl.maxOccupants,
        "Available"
    )
);

                return true;
            }
        }
        return false;
    }

    public boolean declineListing(int listingId) {
        for (roomlisting rl : DataStore.pendingListings) {
            if (rl.listingId == listingId && rl.status.equals("Pending")) {
                rl.status = "Declined";
                return true;
            }
        }
        return false;
    }
}
