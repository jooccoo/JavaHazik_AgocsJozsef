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
public class Katona {
    private int tamadoero;
    private int vedoero;

    public int getTamadoero() {
        return tamadoero;
    }

    public void setTamadoero(int tamadoero) {
        this.tamadoero = tamadoero;
    }

    public int getVedoero() {
        return vedoero;
    }

    public void setVedoero(int vedoero) {
        this.vedoero = vedoero;
    }

    public Katona() {
    this.tamadoero=5;
    this.vedoero=5;
    }

    public Katona(int tamadoero, int vedoero) {
        this.tamadoero = tamadoero;
        this.vedoero = vedoero;
    }

    @Override
    public String toString() {
        return "TE: [" + this.tamadoero + "], VE:[" + this.vedoero + "]";
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() ) {
            return false;
        }
        final Katona other = (Katona) obj;
        if (this.tamadoero != other.tamadoero && this.vedoero != other.vedoero) {
            return false;
        }
        return true;
    }
    
    
    
}
