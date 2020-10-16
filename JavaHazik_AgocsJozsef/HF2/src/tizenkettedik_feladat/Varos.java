/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tizenkettedik_feladat;

/**
 *
 * @author Jocó
 */
public class Varos {
    private String name;
    private int temp;

    public Varos(String name, int temp) {
        this.name = name;
        this.temp = temp;
    }

    public String getName() {
        return name;
    }

    public int getTemp() {
        return temp;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.temp + ")";
    }
    
    
}
