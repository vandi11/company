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
   private FormController frmCtrl;
    
    public MainController(){
        
        start();
        checkDatabase();
    }
    
    private void start(){
        
         dbCtrl = new DatabaseController();
         frmCtrl = new FormController( dbCtrl);
         checkDatabase();
    }
    
    private void checkDatabase() {
        
        
       
        boolean success = dbCtrl.connect();
        
        if(success ) {
            System.out.println("Kapcsolat  OK");
        } else {
            System.err.println("Nincs kapcsolat");
        }
        
    }
    
}
