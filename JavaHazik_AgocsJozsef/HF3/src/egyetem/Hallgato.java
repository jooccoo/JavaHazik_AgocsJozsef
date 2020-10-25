/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egyetem;

import java.util.Random;
import zh.Dolgozat;

/**
 *
 * @author Jocó
 */
public class Hallgato {

    private int mennyitKeszult;
    private boolean sokatTanul;

    public Hallgato(int mennyitKeszult, boolean sokatTanul) {
        this.mennyitKeszult = mennyitKeszult;
        this.sokatTanul = sokatTanul;
    }

    public Dolgozat dolgozatotIr() {
        Random rnd = new Random();
        int nemIr = rnd.nextInt(101);
        int osszPont = -1;
        if (nemIr > 2) {
            if (this.sokatTanul == true) {

                osszPont = (rnd.nextInt((7 - 4) + 1) + 4) * this.mennyitKeszult;
                return new Dolgozat(osszPont);
            } else if (this.sokatTanul == false) {
                osszPont = (rnd.nextInt((5 - 0) + 1) + 0) * this.mennyitKeszult;
                return new Dolgozat(osszPont);
            }
        }
        System.out.println("Nem írt");
        return new Dolgozat(osszPont);

    }
    
}
