/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elso_feladat;

import java.util.Arrays;

/**
 *
 * @author Jocó
 */
public class Main {

    public static Aszu[] keres(Bor[] b) {
        int db = 0;
        for (int i = 0; i < b.length; i++) {
            if (b[i] instanceof Aszu) {
                Aszu tmp = (Aszu) b[i];
                if (tmp.hanyPuttonyos() == 5) {
                    db++;
                }
            }
        }

        Aszu c[] = new Aszu[db];
        int index = 0;
        for (int j = 0; j < b.length; j++) {
            if (b[j] instanceof Aszu) {
                Aszu tmp = (Aszu) b[j];
                if (tmp.hanyPuttonyos() == 5) {
                    c[index] = tmp;
                    index++;
                }
            }
        }
        return c;
    }

    public static void main(String[] args) {

        Bor[] b = new Bor[]{
            new Aszu(5, "Tokaj", 7.5),
            new Bor("Rozé", "Eger", "Száraz", 8.3),
            new Aszu(3, "Balatoni-borvidék", 12),
            new Bor("Fehér", "Badacsony", "Félédes", 11.3),
            new Aszu(5, "Badacsony", 9.3)};

        Aszu[] a = keres(b);

        System.out.println(Arrays.toString(a));

    }

}
