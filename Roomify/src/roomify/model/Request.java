/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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

    public Request(int id, String username, int roomId, String status) {
        this.id = id;
        this.username = username;
        this.roomId = roomId;
        this.status = status;
    }
}
