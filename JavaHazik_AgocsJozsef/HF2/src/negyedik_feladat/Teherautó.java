/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negyedik_feladat;

/**
 *
 * @author Jocó
 */
public class Teherautó extends Autó{
    private int maxSzállíthatóTeher;
    
    public Teherautó(String rendszám, int motorTeljesítmény, int maxSzállíthatóTeher){
        super(rendszám,motorTeljesítmény);
        this.maxSzállíthatóTeher = maxSzállíthatóTeher;
    }

    public int getMaxSzállíthatóTeher() {
        return maxSzállíthatóTeher;
    }

    @Override
    public String toString() {
        return super.toString()+ " Teher: " + this.maxSzállíthatóTeher;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Teherautó)) {
            return false;
        }

        return super.getRendszám().equals(((Teherautó) obj).getRendszám());
    }
    
    
}
