/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Molekula;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Jocó
 */
public class Molekula {

    private String vegyjel;
    private String elem;

    public Molekula(String vegyjel) {
        this.vegyjel = vegyjel;

    }

    public String getVegyjel() {
        return vegyjel;
    }

    public void setVegyjel(String vegyjel) {
        this.vegyjel = vegyjel;
    }

    public String getElem() {
        return elem;
    }

    public void setElem(String elem) {
        this.elem = elem;
    }

}

class Vegyulet {

    private List<Hozzavalo> hozzavalo;
    private String név;

    public Vegyulet(String név) {
        this.név = név;
        this.hozzavalo = new ArrayList<Hozzavalo>();
    }

    public List<Hozzavalo> getHozzavalo() {
        return hozzavalo;
    }

}

class Hozzavalo {

    private String vegyjel;

    public Hozzavalo(String vegyjel) {
        this.vegyjel = vegyjel;
    }

    public String getVegyjel() {
        return vegyjel;
    }

    public void setVegyjel(String vegyjel) {
        this.vegyjel = vegyjel;
    }

}

class Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String sor = null;
        Molekula m;
        Vegyulet v;
        List<Molekula> lim = new ArrayList<>();
        List<Vegyulet> liv = new ArrayList<>();

        boolean beolvas = true;

        while (!(sor = sc.nextLine()).equals("vege")) {
            if (sor.equals("-")) {
                beolvas = false;
            }

            if (beolvas) {
                String[] tmp = sor.split(":");
                m = new Molekula(tmp[0]);
                m.setElem(tmp[1]);
                lim.add(m);
            } else {
                String[] tmp = sor.split("[:,]");
                v = new Vegyulet(tmp[0]);
                for (int i = 1; i < tmp.length; i++) {
                    v.getHozzavalo().add(new Hozzavalo(tmp[i]));
                }
            }
            for(Vegyulet i:liv){
                for(Molekula j:lim){
                    if(j.getVegyjel().contains(i.getHozzavalo()))
                        
                }
            }
        }
    }
}
