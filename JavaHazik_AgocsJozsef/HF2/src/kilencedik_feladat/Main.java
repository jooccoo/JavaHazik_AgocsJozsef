/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kilencedik_feladat;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Jocó
 */
public class Main {

    public static void rendezesEsKereses(Nebulok[] a, String keresett) {

        Nebulok[] rendezett = new Nebulok[a.length];
        rendezett[0] = a[0];
        int j = 1;
        while (j < a.length) {

            for (int i = 1; j < a.length; i++) {

                if (a[i].getElőtte().equals(rendezett[j - 1].getNév())) {
                    rendezett[j] = a[i];
                    j++;
                    break;
                }
            }
        }
        int piros = 0;
        int kek = 0;
        for (int k = 0; k < a.length; k++) {
            if (rendezett[k].getNév().equals(keresett)) {
                if (k == 1) {
                    piros = 1;
                } else if (k % 2 == 1 && k > 1) {
                    piros = k / 2 + 1;
                    kek = k / 2;
                } else if (k % 2 == 0) {
                    piros = k / 2;
                    kek = k / 2;
                }
            }
        }
        System.out.println(piros + " " + kek);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ISO-8859-2");
        int db;
        String sor = null;
        sor = sc.nextLine();
        String[] tokensFirst = sor.split(";");
        db = Integer.parseInt(tokensFirst[0]);
        String elsoGyerek = tokensFirst[1];
        String keresettGyerek = tokensFirst[2];
        Nebulok a[] = new Nebulok[db];
        int i = 0;
        Nebulok b = new Nebulok(elsoGyerek, "-");
        a[i] = b;
        i++;
        while (i < db) {
            sor = sc.nextLine();
            String[] tokensOthers = sor.split(";");
            Nebulok c = new Nebulok(tokensOthers[0], tokensOthers[1]);
            a[i] = c;
            i++;
        }
        rendezesEsKereses(a, "Barnabás");
    }
}
