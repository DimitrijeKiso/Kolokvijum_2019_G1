/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Dimitrije
 */
public class Predmet {
    private int id;
    private String naziv;
    private int ESPB;

    public Predmet() {
    }

    public Predmet(int id, String naziv, int ESPB) {
        this.id = id;
        this.naziv = naziv;
        this.ESPB = ESPB;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getESPB() {
        return ESPB;
    }

    public void setESPB(int ESPB) {
        this.ESPB = ESPB;
    }

    @Override
    public String toString() {
        return "Predmet{" + "naziv=" + naziv + '}';
    }
    
    
    
    
}
