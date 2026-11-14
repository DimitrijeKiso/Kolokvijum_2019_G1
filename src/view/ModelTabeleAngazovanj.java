/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Predaje;

/**
 *
 * @author Dimitrije
 */
public class ModelTabeleAngazovanj extends AbstractTableModel {

    final String[] kolone ={"id","profesor","predmet"};
    
    List<Predaje> listaPredaje = new ArrayList();
    
    ModelTabeleAngazovanj(List<Predaje> lista){
    listaPredaje = lista;
    }
    
    @Override
    public int getRowCount() {
      return  listaPredaje.size();
    }

    @Override
    public int getColumnCount() {
       return kolone.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Predaje p = listaPredaje.get(rowIndex);
        
        switch (columnIndex) {
            case 0:
                return p.getId();
            case 1: 
                return p.getProfesor().getIme();
            case 2: 
                return p.getPredmet().getNaziv();
                default:
                    return "N/A";
        }
    
    }
    

    @Override
    public String getColumnName(int column) {
        return kolone[column];
    }
 
    
    
    
}
