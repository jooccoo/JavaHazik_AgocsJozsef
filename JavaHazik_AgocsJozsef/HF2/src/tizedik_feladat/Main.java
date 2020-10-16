/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tizedik_feladat;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Jocó
 */
public class Main {

    public static void maximumTav(Turak[] t) {
        Turak[] maxTavTurak = new Turak[t.length];
        int maxTav = 0;
        int db = 0;

        for (int i = 0; i < t.length; i++) {
            if (maxTav < t[i].getResztav()) {
                maxTav = t[i].getResztav();
            }
        }
        for (int j = 0; j < t.length; j++) {
            if (maxTav == t[j].getResztav()) {
                maxTavTurak[db] = t[j];
                db++;
            }
        }
        for (int k = 0; k < db; k++) {
            for (int h = k + 1; h < db; h++) {
                if (maxTavTurak[k].getTura_neve().compareTo(maxTavTurak[h].getTura_neve()) > 0) {
                    Turak tmp = maxTavTurak[k];
                    maxTavTurak[k] = maxTavTurak[h];
                    maxTavTurak[h] = tmp;
                }
            }
        }

        for (int l = 0; l < db; l++) {
            System.out.println(maxTavTurak[l]);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ISO-8859-2");
        int db = 0;
        String sor = null;
        sor = sc.nextLine();
        db = Integer.parseInt(sor);
        Turak[] t = new Turak[db];
        int i = 0;
        int j = 0;
        while (i < db) {

            sor = sc.nextLine();

            String[] tokens = sor.split(";");
            int numberLength = tokens.length - 4;
            int[] newArray = new int[numberLength];
            for (j = 4; j < tokens.length; j++) {
                newArray[j - 4] = Integer.parseInt(tokens[j]);
            }

            Turak h = new Turak(Integer.parseInt(tokens[0]),
                    Integer.parseInt(tokens[1]),
                    Integer.parseInt(tokens[2]),
                    tokens[3],
                    newArray);
            t[i] = h;
            i++;

        }
        maximumTav(t);
    }
}
