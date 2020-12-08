/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat_4;

/**
 *
 * @author Jocó
 */



public class Hallgató extends Személy{
    private double tulaj;

    public Hallgató(String név, int életkor, boolean férfi, double tulaj) {
        super(név, életkor, férfi);
        this.tulaj = tulaj;
    }

    public double getTulaj() {
        return tulaj;
    }

    public void setTulaj(double tulaj) {
        this.tulaj = tulaj;
    }

    public String getNév() {
        return név;
    }

    public void setNév(String név) {
        this.név = név;
    }

    public int getÉletkor() {
        return életkor;
    }

    public void setÉletkor(int életkor) {
        this.életkor = életkor;
    }
    
    public boolean JóKépesség(){
        if(this.getTulaj()>4.0)
            return true;
        else
            return false;
    }
    
    @Override
    public String toString() {
        return super.név+"\n"+super.életkor+"\n"+super.isFérfi()+"\n"+this.tulaj;
    }
    
}
