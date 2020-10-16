package tizeneggyedik_feladat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jocó
 */
public class Hullámvasút {

    private String nev;
    private String világ;
    private int magassag;
    private int varakozasiIdo;

    public Hullámvasút(String nev, String világ, int magassag, int varakozasiIdo) {
        this.nev = nev;
        this.világ = világ;
        this.magassag = magassag;
        this.varakozasiIdo = varakozasiIdo;
    }

    public String getNev() {
        return nev;
    }

    public String getVilág() {
        return világ;
    }

    public int getMagassag() {
        return magassag;
    }

    public int getVarakozasiIdo() {
        return varakozasiIdo;
    }

    @Override
    public String toString() {
        return this.nev + " (" + this.világ + "): " + this.varakozasiIdo;
    }

}
