/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harmadik_feladat;

/**
 *
 * @author Jocó
 */
public class Tea implements Rendezheto<Tea> {

    public String nev;
    public int ar;

    public Tea(String s, int j) {
        nev = s;
        ar = j;
    }

    @Override
    public boolean egyenlo(Tea o) {
        if (o == null || !(o instanceof Tea)) {
            return false;
        } else if (this.nev.equals(o.nev) && this.ar == o.ar) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean nagyobbMint(Tea o) {
        if (o == null || !(o instanceof Tea)) {
            return false;
        } else if (this.ar > o.ar) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean kisebbMint(Tea o) {
        if (o == null || !(o instanceof Tea)) {
            return false;
        } else if (this.ar < o.ar) {
            return true;
        } else {
            return false;
        }
    }
}
