/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Objects;

/**
 *
 * @author Dimitrije
 */
public class Proizvod {
    
    private int sifra;
    private String naziv;
    private Double cena;
    private PoreskaStopa poreskaStopa;
    private Proizvodjac proizvodjac;

    public Proizvod() {
    }

    public Proizvod(int sifra, String naziv, Double cena, PoreskaStopa poreskaStopa, Proizvodjac proizvodjac) {
        this.sifra = sifra;
        this.naziv = naziv;
        this.cena = cena;
        this.poreskaStopa = poreskaStopa;
        this.proizvodjac = proizvodjac;
    }
    
    

    public int getSifra() {
        return sifra;
    }

    public void setSifra(int sifra) {
        this.sifra = sifra;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Double getCena() {
        return cena;
    }

    public void setCena(Double cena) {
        this.cena = cena;
    }

    public PoreskaStopa getPoreskaStopa() {
        return poreskaStopa;
    }

    public void setPoreskaStopa(PoreskaStopa poreskaStopa) {
        this.poreskaStopa = poreskaStopa;
    }

    public Proizvodjac getProizvodjac() {
        return proizvodjac;
    }

    public void setProizvodjac(Proizvodjac proizvodjac) {
        this.proizvodjac = proizvodjac;
    }

    @Override
    public String toString() {
        return "Proizvod{" + "sifra=" + sifra + ", naziv=" + naziv + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Proizvod other = (Proizvod) obj;
        if (this.sifra != other.sifra) {
            return false;
        }
        return Objects.equals(this.naziv, other.naziv);
    }
    
    
    
    
}
