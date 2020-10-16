/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kilencedik_feladat;

import java.util.Objects;

/**
 *
 * @author Jocó
 */
public class Nebulok {
    private String név;
    private String előtte;

    public Nebulok(String név, String előtte) {
        this.név = név;
        this.előtte = előtte;
    }

    public String getNév() {
        return név;
    }

    public String getElőtte() {
        return előtte;
    }
    
    @Override
    public String toString() {
        return this.név + ", előtte: " + this.előtte;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj==null  || !(obj instanceof Nebulok))
        {
       return false;
        }
        
        return this.előtte.equals(((Nebulok)obj).név);
    }
    
    
    
    
    
}
