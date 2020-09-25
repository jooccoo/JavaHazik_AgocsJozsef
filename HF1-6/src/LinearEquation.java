/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *  Ez az osztály egy valós világ beli két ismeretlenes egyenlet rendszert
 * és a hozzá tartozó megoldást szimulálja.
 * @author József / WKO7VX
 */
public class LinearEquation {
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public double getE() {
        return e;
    }

    public void setE(double e) {
        this.e = e;
    }

    public double getF() {
        return f;
    }

    public void setF(double f) {
        this.f = f;
    }

    public LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    /**
     * Ez a metódus megivizsgálja és eldönti, hogy megoldható-e az 
     * egyenlet rendszer, úgy hogy kiszámolja, hogy milyen szám fog szerepelni az
     * osztóban.
     * 
     * @return - True, hogy ha megoldató az egyenlet, false, ha nem. 
     */
    public boolean isSolvable(){
        if(((this.a*this.d)-(this.b*this.c)) != 0)
            return true;
        else
            return false;
    }
    /**
     * Ez a metódus kiszámolja és visszaadja az egyenletrendszer megoldását X-re
     * @return - az egyenletrendszer megoldása X-re 
     */
    public double getX(){
        return (((this.e*this.d)-(this.b*this.f))/((this.a*this.d)-(this.b*this.c)));
    }
    /**
     * Ez a metódus kiszámolja és visszaadja az egyenletrendszer megoldását Y-ra
     * @return - az egyenletrendszer megoldása Y-ra  
     */
    public double getY(){
        return (((this.a*this.f)-(this.e*this.c))/((this.a*this.d)-(this.b*this.c)));
    }
}
