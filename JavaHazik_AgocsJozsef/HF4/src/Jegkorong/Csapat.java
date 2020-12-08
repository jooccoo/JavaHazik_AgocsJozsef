/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jegkorong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author Jocó
 */
public class Csapat implements Comparable<Csapat> {

    private String név;
    private int pontszam;
    private int gol;

    public Csapat(String név) {
        this.név = név;
    }

    public String getNév() {
        return név;
    }

    public int getPontszam() {
        return pontszam;
    }

    public void setPontszam(int pontszam) {
        this.pontszam = pontszam;
    }

    public int getGol() {
        return gol;
    }

    public void setGol(int gol) {
        this.gol = gol;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.név).append(": ").append(this.pontszam).append(" points ").append("(").append(this.gol).append(" scored goals)");
        return sb.toString();
        }

    @Override
    public int compareTo(Csapat o) {
        if(this.pontszam == o.getPontszam()) {
            if(this.gol == o.getGol())
                return  this.név.compareTo(o.getNév());
            else
                return Integer.compare(o.getGol(),this.gol);
        }else{
            return Integer.compare(o.getPontszam(),this.pontszam);
        }
    
    }

}

class Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String sor = null;
        List<Csapat> li = new ArrayList<>();

        while (!(sor = sc.nextLine()).equals("vege")) {
            String[] tmp = sor.split("[-:,]");
            Csapat c;
            int hazai = 0;
            int vendeg = 0;
            int oth = 0;
            int otv = 0;
            boolean added = false;
            if (tmp.length < 9) {
                for (int k = 2; k < tmp.length; k += 2) {
                    hazai = hazai + Integer.parseInt(tmp[k]);
                    vendeg = vendeg + Integer.parseInt(tmp[k + 1]);
                }
            } else {
                for (int k = 8; k < tmp.length; k += 2) {
                    oth = oth + Integer.parseInt(tmp[k]);
                    otv = otv + Integer.parseInt(tmp[k + 1]);
                }

            }

            for (int i = 0; i < 2; i++) {
                c = new Csapat(tmp[i]);

                for (Csapat b : li) {
                    if (b.getNév().equals(c.getNév())) {
                        for (int g = i + 2; g < tmp.length; g += 2) {
                            b.setGol(b.getGol() + Integer.parseInt(tmp[g]));
                        }
                        if ((i == 0 && (hazai > vendeg)) || (i == 1 && (hazai < vendeg))) {
                            b.setPontszam(b.getPontszam() + 3);
                        } else if ((i == 0 && oth > otv) || (i == 1 && oth < otv)) {
                            b.setPontszam(b.getPontszam() + 2);
                        } else if ((i == 1 && oth > otv) || (i == 0 && oth < otv)) {
                            b.setPontszam(b.getPontszam() + 1);
                        }

                        added = true;
                    }

                }
                if (!added) {
                    if ((i == 0 && (hazai > vendeg)) || (i == 1 && (hazai < vendeg))) {
                        c.setPontszam(c.getPontszam() + 3);
                    } else if ((i == 0 && oth > otv) || (i == 1 && oth < otv)) {
                        c.setPontszam(c.getPontszam() + 2);
                    } else if ((i == 1 && oth > otv) || (i == 0 && oth < otv)) {
                        c.setPontszam(c.getPontszam() + 1);
                    }

                    for (int g = i + 2; g < tmp.length; g += 2) {
                        c.setGol(c.getGol() + Integer.parseInt(tmp[g]));
                    }
                    li.add(c);
                    added = false;
                }

            }
        }
        Collections.sort(li);
        for (Csapat j : li) {
            System.out.println(j);
        }

    }

}
