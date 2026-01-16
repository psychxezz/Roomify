package roomify.model;

/**
 *
 * @author psychmist
 */
public class roomlisting {
    public int listingId;
    public String ownerUsername;
    public String location;
    public double pricePerWeek;
    public int maxOccupants;
    public boolean Owner;
    public String status; // Pending / Approved / Declined

    public roomlisting(int listingId, String ownerUsername, String location,
                       double price, int occupants, boolean isOwner, String status) {
        this.listingId = listingId;
        this.ownerUsername = ownerUsername;
        this.location = location;
        this.pricePerWeek = price;
        this.maxOccupants = occupants;
        this.Owner = isOwner;
        this.status = status;
    }
}
