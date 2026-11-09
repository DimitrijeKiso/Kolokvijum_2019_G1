/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dbb;

import java.util.ArrayList;
import java.util.List;
import model.Profesor;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import model.Status;
import model.Zvanje;

/**
 *
 * @author Dimitrije
 */
public class DBBroker {

    public List<Profesor> ucitajProfesoreIzBaze() {
        List<Profesor> listaProfesora = new ArrayList<>();
        
        String upit = "SELECT * FROM PROFESOR";
        
        try {
            Statement st = Komunikacija.getKomunikacija().getConnection().createStatement();
            ResultSet rs = st.executeQuery(upit); 
            while (rs.next()) {                
                String ime = rs.getString("ime");
                String prezime = rs.getString("prezime");
                int id = Integer.parseInt(rs.getString("id"));
                Zvanje zvanje  = Zvanje.valueOf(rs.getString("zvanje"));
                Status status = Status.valueOf(rs.getString("status"));
                
                Profesor profesor = new Profesor(id, ime, prezime, zvanje, status);
                listaProfesora.add(profesor);
            }
        } catch (SQLException ex) {
            System.getLogger(DBBroker.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        
        
        return listaProfesora;
    }

    public void izmeniProfu(int id, String ime, String prezime, Zvanje zvanje) {
        
        String upit = "UPDATE PROFESOR SET ime=?,prezime=?,zvanje=? WHERE id=?";
        
        try {
            PreparedStatement st = Komunikacija.getKomunikacija().getConnection().prepareStatement(upit);
            st.setString(1, ime);
            st.setString(2, prezime);
            st.setString(3, String.valueOf(zvanje));
            st.setInt(4, id); 
            st.executeUpdate();
            Komunikacija.getKomunikacija().getConnection().commit();
        } catch (SQLException ex) {
            System.getLogger(DBBroker.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
}
