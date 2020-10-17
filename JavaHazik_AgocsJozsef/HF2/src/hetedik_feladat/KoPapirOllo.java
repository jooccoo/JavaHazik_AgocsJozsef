/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hetedik_feladat;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Jocó
 */
public class KoPapirOllo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ISO-8859-2");
        String jatekos_input = null;
        String cpu = null;
        Random rnd = new Random();
        int t;
        jatekos_input = sc.nextLine();
        while (!jatekos_input.equals("vége")) {

            if (jatekos_input.equals("kő") || jatekos_input.equals("papír") || jatekos_input.equals("olló") || jatekos_input.equals("vége")) {
                t = rnd.nextInt(3);
                if (t == 0) {
                    cpu = "kő";
                } else if (t == 1) {
                    cpu = "papír";
                } else {
                    cpu = "olló";
                }

                if (jatekos_input.equals(cpu)) {
                    System.out.println("Döntetlen!");
                } else if ((jatekos_input.equals("kő") && t == 2) || (jatekos_input.equals("papír") && t == 0) || (jatekos_input.equals("olló") && t == 1)) {
                    System.out.println("Játékos nyert! Játékos:" + jatekos_input + " | Gép:" + cpu);
                } else {
                    System.out.println("A gép nyert! Játékos:" + jatekos_input + " | Gép:" + cpu);
                }
                jatekos_input = sc.nextLine();
            } else {
                System.out.println("Hibás input");
                jatekos_input = sc.nextLine();
            }

        }
    }
}
