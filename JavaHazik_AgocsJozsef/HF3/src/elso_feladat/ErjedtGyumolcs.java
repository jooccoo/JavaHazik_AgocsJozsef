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
public class ErjedtGyumolcs extends Gyümölcs implements Alkoholos<ErjedtGyumolcs>{
    
    private double alkoholTartalom;

    public ErjedtGyumolcs(String fajta, String iz, double alkoholTartalom) {
        super(fajta, iz);
        this.alkoholTartalom = alkoholTartalom;
    }

    @Override
    public double mennyiAlkoholtTartalmaz(ErjedtGyumolcs o) {
        return this.alkoholTartalom;
    }

    @Override
    public String toString() {
        return super.toString()+", alkoholtartalom: "+ this.alkoholTartalom;
    }
    
    
    
}
