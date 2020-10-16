/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tizennegyedik_feladat;

import java.util.Objects;

/**
 *
 * @author Jocó
 */
public class Szotar {
    private String angol;
    private String magyar;

    public String getAngol() {
        return angol;
    }

    public String getMagyar() {
        return magyar;
    }

    public Szotar(String angol, String magyar) {
        this.angol = angol;
        this.magyar = magyar;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
       if (obj==null  || !(obj instanceof Szotar))
        {
       return false;
        }
        
        return this.angol.equals(((Szotar)obj).angol);
    }

    @Override
    public String toString() {
        return this.angol+":"+this.magyar;
    }
    
    
}
