
import java.util.Date;
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *  Ez az osztály italok összehasonlítására szolgál, továbbá lehetőséget nyújt
 * az ár átváltására forintból euróba.
 * @author József / WKO7VX
 */
public class Ital {

    protected String név;
    protected String kiszerelés;
    private static int ár = 10;
    protected Date gyártásiDátum;

    public Ital(String név, String kiszerelés) {
        this.név = név;
        this.kiszerelés = kiszerelés;
        this.gyártásiDátum = new Date();
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
    
    /**
     * Ez a statikus metódus átváltja a forintban megadott árat euróba.
     * Jelenlegi árfolyam: 1 HUF = 0.0028 Eur
     * @return - az átváltott érték 
     */

    public static double getÁrEuróban() {
        return Ital.ár * 0.0028;
    }

    public static int getÁr() {
        return ár;
    }

    public static void setÁr(int ár) {
        Ital.ár = ár;
    }

    @Override
    public String toString() {
        return this.név+", "+this.kiszerelés+", "+Ital.ár+"Ft";
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Ital)) {
            return false;
        }
        Ital tmp = (Ital) obj;
        return this.getNév().equals(tmp.getNév()) && this.getKiszerelés().equals(tmp.getKiszerelés()) && this.getÁr() == tmp.getÁr();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.név);
        hash = 53 * hash + Objects.hashCode(this.kiszerelés);
        return hash;
    }

}
