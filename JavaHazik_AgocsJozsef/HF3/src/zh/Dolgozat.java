/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zh;

import egyetem.Pontozhato;

/**
 *
 * @author Jocó
 */
public class Dolgozat implements Pontozhato<Dolgozat>{
    
    private int pontszam;

    public Dolgozat(int pontszam) {
        this.pontszam = pontszam;
    }

    @Override
    public boolean megfelelt(Dolgozat o) {
    if(o == null || !(o instanceof Dolgozat))
        return false;
    else if(this.pontszam >15)
        return true;
    else if(this.pontszam == -1)
    {
            System.out.println("Nem írt");
            return false;
    }
    else
        return false;
    }

    public int getPontszam() {
        return pontszam;
    }

    public void setPontszam(int pontszam) {
        this.pontszam = pontszam;
    }

    @Override
    public String toString() {
        return "Pontszam:"+ this.pontszam;
    }
    
    
}
