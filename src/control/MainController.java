/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

/**
 *
 * @author Diak
 */
public class MainController {
    
   private DatabaseController dbCtrl;
    
    public MainController(){
        
        checkDatabase();
    }
    
    private void checkDatabase() {
        dbCtrl = new DatabaseController();
        boolean success = dbCtrl.connect();
        
        if(success ) {
            System.out.println("Kapcsolat  OK");
        } else {
            System.err.println("Nincs kapcsolat");
        }
        
    }
    
}
