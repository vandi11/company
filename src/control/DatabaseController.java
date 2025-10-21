/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import model.Connect;
import java.sql.Connection;
import java.util.Vector;

/**
 *
 * @author Diak
 */
public class DatabaseController {
    
    
    private Connection conn; 
    public DatabaseController() {
        
    }
    
    protected boolean connect(){
        
        Connect connect = new Connect( ); //!!!!!"root "
        connect.connecting();
        conn = connect.getConn();
        
        if(conn != null) {
            return true;
        }else {
            return false;
        }
        
    }
    
    protected Vector<Vector<Object>> getWorkerData() {
        
        
    }
}
