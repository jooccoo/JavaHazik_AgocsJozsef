/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harmadik_feladat;

import java.util.Arrays;

/**
 *
 * @author Jocó
 */
public class Main {

    private static Kocsma[] adottItaltKínálóKocsmák(String t, VendéglátóipariEgység[] k) {
        int db = 0;

        for (int i = 0; i < k.length; i++) {
            if (k[i] instanceof Kocsma) {
                Kocsma tmp = (Kocsma) k[i];
                for (int j = 0; j < tmp.getSörlap().length; j++) {
                    if (tmp.getSörlap()[j].equals(t)) {
                        db++;
                        break;

                    }
                }

            }
        }

        Kocsma[] p = new Kocsma[db];
        int index = 0;

        for (int i = 0; i < k.length; i++) {
            if (k[i] instanceof Kocsma) {
                Kocsma tmp = (Kocsma) k[i];
                for (int j = 0; j < tmp.getSörlap().length; j++) {
                    if (tmp.getSörlap()[j].equals(t)) {
                        p[index++] = tmp;
                        break;

                    }
                }

            }
        }
        return p;
    }

    public static void main(String[] args) {
        VendéglátóipariEgység[] k = new VendéglátóipariEgység[]{
            new Étterem("FastFoodBar", 300, new String[]{"Hambi", "Gyros", "Pita"}),
            new Étterem("Restaurant", 400, new String[]{"Spagetti", "Soup", "Deep Fried Chichken"}),
            new Étterem("Burger King", 150, new String[]{"Hamburger", "Nugget", "Fries"}),
            new Étterem("McDonalds", 200, new String[]{"Hamburger", "Nugget", "Fries", "Salad"}),
            new Étterem("Kfc", 100, new String[]{"Hamburger", "Nugget", "Fries", "Salad", "Deep Fried Chichken"}),
            new Kocsma("Ibolya", 100, new String[]{"Borsodi", "Soproni", "Kőbányai", "Löwenbrau"}),
            new Kocsma("Romkocsma", 120, new String[]{"Borsodi", "Soproni", "Guineness", "Corona"}),
            new Kocsma("Aranyfácán", 100, new String[]{"Steffi", "Stella Artois", "Miller", "Corona"}),
            new Kocsma("Beer and Pub", 100, new String[]{"Heineken", "Soproni", "Kőbányai", "Corona"}),
            new Kocsma("Beer and Wurst", 100, new String[]{"Budweiser", "Corona", "Guinness", "Kronenbourg"})
        };

        System.out.println(Arrays.toString(adottItaltKínálóKocsmák("Corona", k)));

    }
}
