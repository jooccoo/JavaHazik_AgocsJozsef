/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elso_feladat;

/**
 *
 * @author Jocó
 */
public class Aszu extends Bor {
    private int puttonySzam;

    public Aszu(int puttonySzam, String termoTerulet, double alkoholTartalom) {
        super("furmint", termoTerulet, "édes", alkoholTartalom);
        this.puttonySzam = puttonySzam;
    }

    public int hanyPuttonyos() {
        return puttonySzam;
    }

    @Override
    public String toString() {
        return super.toString()+", puttonyszam: "+ this.puttonySzam;
    }
    
    
    
}
