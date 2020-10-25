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
public class Gyümölcs {
    private String fajta;
    private String iz;

    public Gyümölcs(String fajta, String iz) {
        this.fajta = fajta;
        this.iz = iz;
    }

    public String milyenFajta() {
        return fajta;
    }

    public String milyentIzu() {
        return iz;
    }

    @Override
    public String toString() {
        return "Fajta: "+ this.fajta + ", iz: "+ this.iz;
    }
    
    
    
}
