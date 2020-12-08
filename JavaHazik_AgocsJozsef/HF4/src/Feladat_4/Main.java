/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Jocó
 */
public class Main {

    public static double jóÁtlag(Személy[] k) {
        int db = 0;
        double osszeg = 0;
        for (int i = 0; i < k.length; i++) {
            if (k[i] instanceof Hallgató) {
                Hallgató tmp = (Hallgató) k[i];
                if (tmp.getTulaj() >= 4) {
                    db++;
                    osszeg = osszeg + tmp.getÉletkor();
                }
            }
        }
         return osszeg / db;
    }

    public static void main(String[] args) {
        Személy p1 = new Személy("Mona Liza", 20, false);
        System.out.println(p1);
        int i = 0;
        Személy[] tomb = new Személy[]{};
        Scanner sc = new Scanner(System.in);
        String sor = null;

        while (i < 4) {
            String[] tmp = sor.split("");
            if (i <= 1) {
                tomb[i] = new Hallgató(tmp[0], Integer.parseInt(tmp[1]), Boolean.parseBoolean(tmp[2]), Double.parseDouble(tmp[3]));
            } else if (i > 1) {
                tomb[i] = new Oktató(tmp[0], Integer.parseInt(tmp[1]), Boolean.parseBoolean(tmp[2]), tmp[3]);
            }

        }

    }

}
