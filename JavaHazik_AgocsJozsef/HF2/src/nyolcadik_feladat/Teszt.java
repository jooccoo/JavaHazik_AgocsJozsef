/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nyolcadik_feladat;

/**
 *
 * @author Jocó
 */
public class Teszt {

    public static Katona megkuzd(Katona k1, Katona k2) {
        System.out.println(k1 + " megküzd vele: " + k2);
        if (k1.getTamadoero() >= k2.getVedoero()) {
            System.out.println("A tamado katona nyert!");
            return k1;
        } else {
            System.out.println("A vedo katona nyert!");
            return k2;
        }

    }

    public static void main(String[] args) {

        Katona pista = new Nyilas(10);
        Katona jozsi = new Nyilas(20, 30, 30);
        Katona brendon = new Landzsas(20, 40);

        Katona nyertes = megkuzd(megkuzd(pista, jozsi), brendon);

        if (pista.equals(nyertes)) {
            System.out.println("Életben maradt: Pista");
        } else if (jozsi.equals(nyertes)) {
            System.out.println("Életben maradt: Józsi");
        } else if (brendon.equals(nyertes)) {
            System.out.println("Életben maradt: Brendon");
        } else {
            System.out.println("HIBA!!!");
        }

    }
}
