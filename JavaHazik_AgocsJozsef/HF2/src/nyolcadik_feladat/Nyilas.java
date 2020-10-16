/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nyolcadik_feladat;

/**
 *
 * @author Jocó
 */
public class Nyilas extends Katona {
    private int lőtáv;

    public int getLőtáv() {
        return lőtáv;
    }

    public void setLőtáv(int lőtáv) {
        this.lőtáv = lőtáv;
    }

    @Override
    public int getTamadoero() {
        return super.getTamadoero() + this.getLőtáv();
    }

    public Nyilas(int lőtáv) {
        this.lőtáv = lőtáv;
    }

    
    public Nyilas(int tamadoero, int vedoero, int lőtáv) {
        super(tamadoero, vedoero);
        this.lőtáv = lőtáv;
    }

    @Override
    public String toString() {
        return "Nyilas: TE:[" + this.getTamadoero() +"], VE:["+ this.getVedoero()+"]";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        
        final Nyilas other = (Nyilas) obj;
        if ((this.lőtáv != other.lőtáv )&& (this.getVedoero() != other.getVedoero()) && (this.getTamadoero()) != other.getTamadoero()) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
