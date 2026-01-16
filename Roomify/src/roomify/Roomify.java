/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package roomify;
import roomify.model.DataStore;
import roomify.view.LoginFrame;
/**
 *
 * @author psychmist
 */
public class Roomify {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    DataStore.seed();
    new LoginFrame().setVisible(true);
}
// TODO code application logic here
    }
    

