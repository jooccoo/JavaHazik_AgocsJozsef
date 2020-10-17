/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tizenharmadik_feladat;

/**
 *
 * @author Jocó
 */
public class Turazo {

    private String nev;
    private String utvonal;
    private int kek;
    private int piros;
    private int sarga;
    private int zold;
    private int nincsJel;

    public Turazo(String nev, String utvonal) {
        this.nev = nev;
        this.utvonal = utvonal;
    }

    public String getNev() {
        return nev;
    }

    public String getUtvonal() {
        return utvonal;
    }

    public int getKek() {
        return kek;
    }

    public void setKek(int kek) {
        this.kek = kek;
    }

    public int getPiros() {
        return piros;
    }

    public void setPiros(int piros) {
        this.piros = piros;
    }

    public int getSarga() {
        return sarga;
    }

    public void setSarga(int sarga) {
        this.sarga = sarga;
    }

    public int getZold() {
        return zold;
    }

    public void setZold(int zold) {
        this.zold = zold;
    }

    public int getNincsJel() {
        return nincsJel;
    }

    public void setNincsJel(int nincsJel) {
        this.nincsJel = nincsJel;
    }

    @Override
    public String toString() {
        return this.nev;
    }

}
