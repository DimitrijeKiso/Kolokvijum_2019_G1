/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dbb.DBBroker;
import java.util.ArrayList;
import java.util.List;
import model.PoreskaStopa;
import model.Profesor;
import model.Proizvod;
import model.Proizvodjac;
import model.Zvanje;

/**
 *
 * @author Dimitrije
 */
public class Controller {
 
    private static Controller instance;
    
    List<Proizvod> listaProizvoda = new ArrayList<>();
    List<Proizvodjac> listaProizvodjaca = new ArrayList<>();
    List<PoreskaStopa> listaPoreskihStopa = new ArrayList<>();
    
    private DBBroker dbb;

    public Controller() {
        dbb = new DBBroker();
        
      PoreskaStopa ps1 = new PoreskaStopa(1,"PS1",0.20);
      PoreskaStopa ps2 = new PoreskaStopa(2,"PS2",0.05);
      PoreskaStopa ps3 = new PoreskaStopa(3,"PS3",0.10);
      listaPoreskihStopa.add(ps1);
      listaPoreskihStopa.add(ps2);
      listaPoreskihStopa.add(ps3);
      
      
      Proizvodjac pr1 = new Proizvodjac(1, "Proizvodjac 1");
      Proizvodjac pr2 = new Proizvodjac(2, "Proizvodjac 2");
      Proizvodjac pr3 = new Proizvodjac(3, "Proizvodjac 3");
      listaProizvodjaca.add(pr1);
      listaProizvodjaca.add(pr2);
      listaProizvodjaca.add(pr3);
      
      Proizvod p1 = new Proizvod(1,"Prozivod1",149.99,ps1,pr1);
      Proizvod p2 = new Proizvod(2,"Prozivod2",154999.99,ps2,pr2); 
      Proizvod p3 = new Proizvod(3,"Prozivod3",1519299.99,ps3,pr3);
      listaProizvoda.add(p1);
      listaProizvoda.add(p2);
      listaProizvoda.add(p3);
        
    }

    public static Controller getInstance(){
        if (instance == null) {
            instance = new Controller();
        }
        return instance;
    }
    
    
    public List<Proizvod> getListaProizvoda() {
        return listaProizvoda;
    }

    public void setListaProizvoda(List<Proizvod> listaProizvoda) {
        this.listaProizvoda = listaProizvoda;
    }

    public List<Proizvodjac> getListaProizvodjaca() {
        return listaProizvodjaca;
    }

    public List<PoreskaStopa> getListaPoreskihStopa() {
        return listaPoreskihStopa;
    }

    public List<Profesor> ucitajProfesoreIzBaze() {
        return dbb.ucitajProfesoreIzBaze();
    }

    public void izmeniProfu(int id, String ime, String prezime, Zvanje zvanje) {
        dbb.izmeniProfu(id,ime,prezime,zvanje);
    }


    
    
    
    
    
}
