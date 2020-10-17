/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tizenharmadik_feladat;

import java.util.Scanner;

/**
 *
 * @author Jocó
 */
public class Main {

    public static void atalakit(Turazo h, String utvonal) {
        char[] t = utvonal.toCharArray();
        int kek = 0;
        int piros = 0;
        int sarga = 0;
        int zold = 0;
        int nincsJel = 0;
        for (int j = 0; j < t.length; j++) {
            switch (t[j]) {
                case 'K':
                    kek++;
                    break;
                case 'P':
                    piros++;
                    break;
                case 'S':
                    sarga++;
                    break;
                case 'Z':
                    zold++;
                    break;
                case '.':
                    nincsJel++;
                    break;
                default:
                    break;
            }
        }
        h.setKek(kek);
        h.setPiros(piros);
        h.setSarga(sarga);
        h.setZold(zold);
        h.setNincsJel(nincsJel);
    }

    public static void rendez(Turazo[] t) {
        for (int i = 0; i < t.length - 1; i++) {
            for (int j = i + 1; j < t.length; j++) {
                if (t[i].getKek() == t[j].getKek()) {
                    if ((t[i].getKek() + t[i].getPiros() + t[i].getSarga() + t[i].getZold()) == (t[j].getKek() + t[j].getPiros() + t[j].getSarga() + t[j].getZold())) {
                        if (t[i].getNev().compareTo(t[j].getNev()) > 0) {
                            Turazo tmp = t[i];
                            t[i] = t[j];
                            t[j] = tmp;
                        }
                    } else if ((t[i].getKek() + t[i].getPiros() + t[i].getSarga() + t[i].getZold()) < (t[j].getKek() + t[j].getPiros() + t[j].getSarga() + t[j].getZold())) {
                        Turazo tmp = t[i];
                        t[i] = t[j];
                        t[j] = tmp;
                    }
                } else if (t[i].getKek() < t[j].getKek()) {
                    Turazo tmp = t[i];
                    t[i] = t[j];
                    t[j] = tmp;
                }
            }
        }
    }

    public static void kiir(Turazo[] t) {
        for (int i = 0; i < t.length; i++) {
            System.out.println(t[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Turazo[] t = new Turazo[n];
        int i = 0;
        String sor = null;

        while (i < n) {
            sor = sc.nextLine();
            String[] tokens = sor.split(";");
            String utvonal = tokens[1];
            Turazo h = new Turazo(tokens[0], tokens[1]);
            atalakit(h, utvonal);
            t[i] = h;
            i++;
        }
        rendez(t);
        kiir(t);
    }
}
