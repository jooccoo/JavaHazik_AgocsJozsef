package tizeneggyedik_feladat;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jocó
 */
public class Main {

    private static void rendez(Hullámvasút[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i].getVarakozasiIdo() == a[j].getVarakozasiIdo()) {
                    if (a[i].getMagassag() == a[j].getMagassag()) {
                        if (a[i].getNev().compareTo(a[j].getNev()) > 0) {
                            Hullámvasút tmp = a[i];
                            a[i] = a[j];
                            a[j] = tmp;
                        }
                    } else if (a[i].getMagassag() < a[j].getMagassag()) {
                        Hullámvasút tmp = a[i];
                        a[i] = a[j];
                        a[j] = tmp;
                    }
                } else if (a[i].getVarakozasiIdo() > a[j].getVarakozasiIdo()) {
                    Hullámvasút tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
    }

    public static void kiir(Hullámvasút[] t) {
        for (int i = 0; i < t.length; i++) {
            System.out.println(t[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Hullámvasút[] t = new Hullámvasút[n];
        int i = 0;
        String sor = null;
        while (i < n) {
            sor = sc.nextLine();
            String[] tokens = sor.split(";");
            Hullámvasút h = new Hullámvasút(tokens[0], tokens[1], Integer.parseInt(tokens[2]), Integer.parseInt(tokens[3]));
            t[i] = h;
            i++;
        }
        rendez(t);
        kiir(t);
    }
}
