/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import model.Connect;
import java.sql.Connection;
import java.util.Vector;
import model.SqlRunner;

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
        
        Vector<Vector<Object>> items = new Vector<>();
        SqlRunner sqlRun = new SqlRunner("__GETWORKERS__");
        
        items = sqlRun.getworkersData( conn );
        
        return items;
    }
}
