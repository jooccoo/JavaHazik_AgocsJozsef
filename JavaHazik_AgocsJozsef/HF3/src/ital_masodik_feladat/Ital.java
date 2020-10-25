/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ital_masodik_feladat;

import java.util.Objects;

/**
 *
 * @author Jocó
 */
public class Ital implements Comparable<Ital>{

    protected String név;
    protected String kiszerelés;
    protected int ár;

    public Ital(String név, String kiszerelés, int ár) {
        this.név = név;
        this.kiszerelés = kiszerelés;
        this.ár = ár;
    }

    public String getNév() {
        return név;
    }

    public void setNév(String név) {
        this.név = név;
    }

    public String getKiszerelés() {
        return kiszerelés;
    }

    public void setKiszerelés(String kiszerelés) {
        this.kiszerelés = kiszerelés;
    }

    public int getÁr() {
        return ár;
    }

    public void setÁr(int ár) {
        this.ár = ár;
    }

    @Override
    public String toString() {
        return this.név +", "+ this.kiszerelés +", "+ this.ár+" Ft";
    }

    @Override
    public int compareTo(Ital o) {
       if (this.ár==o.getÁr())
           return 0;
       else if(this.ár>o.getÁr())
           return 10;
       else 
           return -10;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Ital)){
            return false;  
        }
        Ital tmp = (Ital) obj;
        
        if(this.név.equals(tmp.getNév()) && this.ár == tmp.getÁr())
            return true;
        else
            return false;
    }
    
    
    



}
