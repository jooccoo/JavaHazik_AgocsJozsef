/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mozisztarok_film_szerint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Jocó
 */
public class Mozisztárok implements Comparable<Mozisztárok> {

    private String cim;
    private List<Szereplo> szereplo;

    public Mozisztárok(String cim) {
        this.cim = cim;
        this.szereplo = new ArrayList<Szereplo>();
    }

    public String getCim() {
        return cim;
    }

    public List<Szereplo> getSzereplo() {
        return szereplo;
    }

    @Override
    public int compareTo(Mozisztárok t) {
        if (this.szereplo.size() == t.getSzereplo().size()) {
            return this.cim.compareTo(t.getCim());
        } else {
            return (-1) * Integer.compare(this.szereplo.size(), t.getSzereplo().size());
        }
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(this.cim).append("\n");
        Collections.sort(this.szereplo);
        for (Szereplo i : this.szereplo) {
            sb.append(i).append("\n");
        }
        return sb.toString();
    }
}

class Szereplo implements Comparable<Szereplo> {

    private String név;
    private int év;

    public Szereplo(String név, int év) {
        this.név = név;
        this.év = év;
    }

    public String getNév() {
        return név;
    }

    public int getÉv() {
        return év;
    }

    @Override
    public int compareTo(Szereplo t) {
        if (this.év == t.getÉv()) {
            return this.név.compareTo(t.getNév());
        } else {
            return Integer.compare(this.év, t.getÉv());
        }
    }

    @Override
    public String toString() {
        return this.év + ": " + this.név;
    }
}

class Test2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String sor = null;
        List<Mozisztárok> li = new ArrayList<>();
        

        while (!(sor = sc.nextLine()).equals("vege")) {
            String[] tmp = sor.split("[;(:)]");
            Mozisztárok m;
            boolean added = false;
            
            for (int i = 3; i < tmp.length; i++) {
                m = new Mozisztárok(tmp[i]);
                added = false;
                for(Mozisztárok j:li){
                    if(j.getCim().equals(m.getCim())){
                         j.getSzereplo().add(new Szereplo(tmp[0], Integer.parseInt(tmp[1])));
                         added = true;
                    }
                }
                if(!added){
                    m.getSzereplo().add(new Szereplo(tmp[0], Integer.parseInt(tmp[1])));  
                    li.add(m);
                }           
            }
        }
        Collections.sort(li);
        for(Mozisztárok i:li)
            System.out.println(i);
    }
}
