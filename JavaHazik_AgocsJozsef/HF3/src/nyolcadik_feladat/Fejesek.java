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
public class Fejesek implements Comparable<Fejesek> {

    private String nev;
    private int osszgol;
    private int szabadrugas;
    private int bunteto;
    private int akciogol;
    private double fejgol;

    public Fejesek(String nev, int osszgol, int szabadrugas, int bunteto) {
        this.nev = nev;
        this.osszgol = osszgol;
        this.szabadrugas = szabadrugas;
        this.bunteto = bunteto;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getOsszgol() {
        return osszgol;
    }

    public void setOsszgol(int osszgol) {
        this.osszgol = osszgol;
    }

    public int getSzabadrugas() {
        return szabadrugas;
    }

    public void setSzabadrugas(int szabadrugas) {
        this.szabadrugas = szabadrugas;
    }

    public int getBunteto() {
        return bunteto;
    }

    public void setBunteto(int bunteto) {
        this.bunteto = bunteto;
    }

    public int getAkciogol() {
        return akciogol;
    }

    public void setAkciogol(int akciogol) {
        this.akciogol = akciogol;
    }

    public double getFejgol() {
        return fejgol;
    }

    public void setFejgol(double fejgol) {
        this.fejgol = fejgol;
    }

    @Override
    public String toString() {
        return this.nev + ": " + (int)this.fejgol;
    }

    @Override
    public int compareTo(Fejesek o) {
        int fejes = Double.compare(o.fejgol, this.fejgol);
        if (fejes != 0) {
            return fejes;
        }

        int osszes = Integer.compare(o.osszgol, this.osszgol);
        if (osszes != 0) {
            return osszes;
        }

        int sikeresBunteto = Integer.compare(this.bunteto, o.bunteto);
        if (sikeresBunteto != 0) {
            return sikeresBunteto;
        }

        return this.nev.compareTo(o.nev);
    }

}
