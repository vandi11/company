/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import model.Connect;
import java.sql.Connection;

/**
 *
 * @author Diak
 */
public class DatabaseController {
    
    
    private Connection conn; 
    public DatabaseController() {
        
    }
    
    protected boolean connect(){
        
        Connect connect = new Connect( "company" ,"root" ,""); //!!!!!"root "
        connect.connecting();
        conn = connect.getConn();
        
        if(conn != null) {
            return true;
        }else {
            return false;
        }
        
    }
}
