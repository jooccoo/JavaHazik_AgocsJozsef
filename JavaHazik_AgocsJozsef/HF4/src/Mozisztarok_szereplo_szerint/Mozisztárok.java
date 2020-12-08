/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mozisztarok_szereplo_szerint;

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

    private String név;
    private List<Film> film;

    public Mozisztárok(String név) {
        this.név = név;
        this.film = new ArrayList<Film>();
    }

    public String getNév() {
        return név;
    }

    public List<Film> getFilm() {
        return film;
    }

    @Override
    public int compareTo(Mozisztárok t) {
        if (this.film.size() == t.getFilm().size()) {
            return this.név.compareTo(t.getNév());
        } else {
            return (-1) * Integer.compare(this.film.size(), t.getFilm().size());
        }
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(this.név).append("\n");
        Collections.sort(this.film);
        for (Film i : this.film) {
            sb.append(i).append("\n");
        }
        return sb.toString();
    }
}

class Film implements Comparable<Film> {

    private String cím;
    private int év;

    public Film(String cím, int év) {
        this.cím = cím;
        this.év = év;
    }

    public String getCím() {
        return cím;
    }

    public int getÉv() {
        return év;
    }

    @Override
    public int compareTo(Film t) {
        if (this.év == t.getÉv()) {
            return this.cím.compareTo(t.getCím());
        } else {
            return Integer.compare(this.év, t.getÉv());
        }
    }

    @Override
    public String toString() {
        return this.év + ": " + this.cím;
    }
}

class Test2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String sor = null;
        List<Mozisztárok> li = new ArrayList<>();
        

        while (!(sor = sc.nextLine()).equals("vege")) {
            String[] tmp = sor.split("[,(:)]");
            Mozisztárok m;
            boolean added = false;
            
            for (int i = 3; i < tmp.length; i++) {
                m = new Mozisztárok(tmp[i]);
                added = false;
                for(Mozisztárok j:li){
                    if(j.getNév().equals(m.getNév())){
                         j.getFilm().add(new Film(tmp[0], Integer.parseInt(tmp[1])));
                         added = true;
                    }
                }
                if(!added){
                    m.getFilm().add(new Film(tmp[0], Integer.parseInt(tmp[1])));  
                    li.add(m);
                }           
            }
        }
        Collections.sort(li);
        for(Mozisztárok i:li)
            System.out.println(i);
    }
}
