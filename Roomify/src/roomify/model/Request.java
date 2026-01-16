package roomify.model;

/**
 *
 * @author psychmist
 */
public class Request {
     public int id;
    public String username;
    public int roomId;
    public String status;
    public Double proposedPrice;

    public Request(int id, String username, int roomId, String status) {
        this.id = id;
        this.username = username;
        this.roomId = roomId;
        this.status = status;
        this.proposedPrice = null;

    }
}
