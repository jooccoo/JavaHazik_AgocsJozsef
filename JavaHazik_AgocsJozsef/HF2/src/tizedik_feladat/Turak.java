/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tizedik_feladat;

import java.util.Objects;

/**
 *
 * @author Jocó
 */
public class Turak {

    private int ev;
    private int honap;
    private int nap;
    private String tura_neve;
    private int[] resztav;

    public int getEv() {
        return ev;
    }

    public int getHonap() {
        return honap;
    }

    public int getNap() {
        return nap;
    }

    public String getTura_neve() {
        return tura_neve;
    }

    public int getResztav() {
        int reszTavOsszeg = 0;
        for (int i = 0; i < resztav.length; i++) {
            reszTavOsszeg += resztav[i];
        }

        return reszTavOsszeg;
    }

    public Turak(int ev, int honap, int nap, String tura_neve, int[] resztav) {
        this.ev = ev;
        this.honap = honap;
        this.nap = nap;
        this.tura_neve = tura_neve;
        this.resztav = resztav;
    }

    @Override
    public String toString() {
        return this.ev + ";"+ this.honap + ";"+this.nap+ ";"+ this.tura_neve;
    }
}