/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dbb;
import java.sql.*;
import java.sql.DriverManager;
/**
 *
 * @author Dimitrije
 */
public class Komunikacija {
    
    private static Komunikacija komunikacija;
    Connection connection;

    public Komunikacija() {
        
        String url ="jdbc:mysql://localhost:3306/profesori";
        
        try {
            connection = DriverManager.getConnection(url, "root", "");
            connection.setAutoCommit(false); 
        } catch (SQLException ex) {
            System.getLogger(Komunikacija.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        
    }
    
    public static Komunikacija getKomunikacija(){
        if (komunikacija == null) {
            komunikacija = new Komunikacija();
        }
        return komunikacija;
    }

    public Connection getConnection() {
        return connection;
    }
    
    
    
    
    
    
}
