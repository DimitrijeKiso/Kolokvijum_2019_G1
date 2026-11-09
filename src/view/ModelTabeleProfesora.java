/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.Controller;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import model.Profesor;

/**
 *
 * @author Dimitrije
 */
public class ModelTabeleProfesora extends AbstractTableModel {

    List<Profesor> listaProfesora ;
    
    final String[] kolone = {"id","ime","prezime","zvanje","status"};

    public ModelTabeleProfesora(List<Profesor> listaProfesora){
    this.listaProfesora = listaProfesora;
    }
    
    
    
    @Override
    public int getRowCount() {
       return listaProfesora.size();
    }

    @Override
    public int getColumnCount() {
        return kolone.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Profesor profa = listaProfesora.get(rowIndex);
        
        switch (columnIndex) {
            case 0:
                return profa.getId();
            case 1:
                return profa.getIme();
            case 2: 
                return profa.getPrezime();
            case 3: 
                return profa.getStatus();
            case 4: 
                return profa.getZvanje();
            default:
                return "N/A";
        }
        
    }

    @Override
    public String getColumnName(int column) {
        return kolone[column];
    }
    
    
    
}
