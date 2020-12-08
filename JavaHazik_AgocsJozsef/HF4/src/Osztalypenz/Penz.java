/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Osztalypenz;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author Jocó
 */
public class Penz implements Comparable<Penz> {

    private String neve;
    private int mennyi;

    public Penz(String neve, int mennyi) {
        this.neve = neve;
        this.mennyi = mennyi;
    }

    public String getNeve() {
        return neve;
    }

    public int getMennyi() {
        return mennyi;
    }

    @Override
    public int compareTo(Penz t) {
        if (this.mennyi == t.getMennyi()) {
            return this.neve.compareTo(t.getNeve());
        } else {
            return (-1) * Integer.compare(this.mennyi, t.getMennyi());
        }
    }

    @Override
    public String toString() {
        return this.neve + ";" + this.mennyi;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + Objects.hashCode(this.neve);
        hash = 43 * hash + this.mennyi;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Penz)) {
            return false;
        }

        Penz tmp = (Penz) obj;

        return this.neve.equals(tmp.getNeve());

    }

}

class Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String sor = null;
        List<Penz> li = new ArrayList<>();
        Map<String, Integer> seged_map = new HashMap<>();

        while (!(sor = sc.nextLine()).equals("vege")) {
            String[] tmp = sor.split(";");

            if (seged_map.containsKey(tmp[0])) {

                seged_map.put(tmp[0], Integer.parseInt(tmp[1]) + seged_map.get(tmp[0]));

            } else {

                seged_map.put(tmp[0], Integer.parseInt(tmp[1]));

            }

        }

        for (String s : seged_map.keySet()) {
            li.add(new Penz(s, seged_map.get(s)));
        }

        Collections.sort(li);
        for (Penz i : li) {
            System.out.println(i);
        }
    }
}
