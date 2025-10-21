/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Vector;



public class SqlRunner {
    
    private String fileName;
    
    private SqlRunner(String sqlName) {
        
        
        fileName = "sql/" + sqlName + ".sql"; // sql/__GETWORKERS__.sql
    }
    
    private String[] getSqlQuery() {
        
        String[] sql = null;
        Path filePath = Path.of(fileName);
        
        try {
            
            String content = Files.readString(filePath);
            sql = content.split(";");
            
        } catch(IOException ex) {
            
            System.err.println("Az sQL file nem található");
        }
        
        return sql;
    }
    
    public Vector<Vector<Object>> getworkersData(Connection conn) {
        
        String[] sql = getSqlQuery();
        Statement stmt = null;
        ResultSet rs = null;
        Vector<Vector<Object>> items = new Vector<>();
        
        
        try {
           stmt = conn.createStatement();
           rs = stmt.executeQuery( sql[0]);
           
           while( rs.next() ) {
               
               Vector<Object> row = new Vector<>();
               row.add( rs.getObject(1 ));
               row.add( rs.getObject(2 ));
               row.add( rs.getObject(3 ));
               row.add( rs.getObject(4));
               row.add( rs.getObject(5 ));
               row.add( rs.getObject(6));
               row.add( rs.getObject(7 ));
               
               items.add(row);
           }
           
           
        } catch(SQLException ex) {
            
            System.err.println( "Hiba a lekérdezés során" );
        }
        
        return items;
    }
}
