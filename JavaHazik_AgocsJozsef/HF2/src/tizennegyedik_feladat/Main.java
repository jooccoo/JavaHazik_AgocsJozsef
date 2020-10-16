/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tizennegyedik_feladat;

import java.util.Scanner;

/**
 *
 * @author Jocó
 */
public class Main {

    public static void rendez(Szotar[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i].getAngol().equals(a[j])) {
                    if (a[i].getMagyar().compareTo(a[j].getMagyar()) > 0) {
                        Szotar tmp = a[i];
                        a[i] = a[j];
                        a[j] = tmp;
                    }
                } else if (a[i].getAngol().compareTo(a[j].getAngol()) > 0) {
                    Szotar tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }

            }
        }

    }
    
     public static void kiir(Szotar[] t) {
        for (int i = 0; i < t.length; i++) {
            System.out.println(t[i]);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Szotar[] t = new Szotar[n];
        int i = 0;

        String sor = null;

        while (i < n) {

            sor = sc.nextLine();

            String[] tokens = sor.split(":");

            Szotar h = new Szotar(tokens[0], tokens[1]);
            t[i] = h;
            i++;

        }
        rendez(t);
        kiir(t);
    }
}
