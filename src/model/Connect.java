/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Diak
 */
public class Connect {
    
    private Connection conn;
    private String dbName;
    private String user;
    private String pass;
    private String url;
    
    public Connect() {
        
      /*  this.dbName = dbName;
        this.user = user;
        this.pass = pass;
        url = "jdbc:mariadb://localhost:3306/"; */
      
      conn = null;
        
    }
    
    public void connecting() {
        
        //jdbc:mariadb://localhost:3306/company?username=user&password=pass;
        conn = null;
        String user = "?username=" + this.user;
        String pass = "&password=" + this.pass;
        System.out.println(url + dbName + user + pass);
        try {
            //conn = DriverManager.getConnection( url + dbName + user + pass);
            conn=DriverManager.getConnection("jdbc:mariadb://localhost:3306/company","root","");
        } catch (SQLException ex) {
            
            System.err.println( "Hiba a  kapcsolódás során" );
            ex.printStackTrace();
        }
    }

    public Connection getConn() {
        return conn;
    }
}
