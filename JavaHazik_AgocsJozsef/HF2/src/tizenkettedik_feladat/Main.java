/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tizenkettedik_feladat;

import java.util.Scanner;

/**
 *
 * @author Jocó
 */
public class Main {

    public static void rendezesKereses(Varos[] t, String hely) {
        for (int i = 0; i < t.length-1 ; i++) {
            for (int j = i + 1; j < t.length; j++) {
                if (t[i].getTemp() < t[j].getTemp()) {
                    Varos tmp = t[i];
                    t[i] = t[j];
                    t[j] = tmp;
                }
                else if((t[i].getTemp() == t[j].getTemp())){
                    if(t[i].getName().compareTo(t[j].getName()) > 0){
                        Varos tmp = t[i];
                        t[i] = t[j];
                        t[j] = tmp;
                    }
                }
            }
        }

        for (int h = 0; h < t.length; h++) {
            if(t[h].getName().compareTo(hely) == 0)
                break;
            else
                System.out.println(t[h]);       
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ISO-8859-2");
        int db = 0;
        String keresettVaros = null;
        boolean varosLetezik = false;
        String sor = null;
        sor = sc.nextLine();
        String[] tokensFirst = sor.split(" ");
        db = Integer.parseInt(tokensFirst[0]);
        keresettVaros = tokensFirst[1];
        Varos v[] = new Varos[db];
        int i = 0;

        while (i < db) {
            sor = sc.nextLine();
            String[] tokens = sor.split(":");
            Varos t = new Varos(tokens[0], Integer.parseInt(tokens[1]));
            if(tokens[0].equals(keresettVaros))
                varosLetezik = true;
            v[i]=t;
            i++;
        }
        if( varosLetezik == false)
            System.out.println("Missing data");
        else
            rendezesKereses(v, keresettVaros);
    }
}
