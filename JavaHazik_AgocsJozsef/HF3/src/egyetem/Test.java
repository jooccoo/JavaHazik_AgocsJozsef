/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egyetem;

import java.util.Scanner;
import zh.Dolgozat;

/**
 *
 * @author Jocó
 */
public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sor;
        boolean keszult = false;
        int db =0;
        
         sor = sc.nextLine();
        db = Integer.parseInt(sor);
        Hallgato h[] = new Hallgato[db];
        Dolgozat d1 [] = new Dolgozat [db];
        Dolgozat d2 [] = new Dolgozat [db];
        
        int i = 0;
        while (i < db) {
            sor = sc.nextLine();
            String token[] = sor.split(" ");
            if(token[1].equals("igaz"))
               keszult=true;
            if(token[1].equals("hamis"))
                keszult=false;
            if ((Integer.parseInt(token[0]) <= -1 && Integer.parseInt(token[0]) >= 6) || (!(token[1].equals("igaz")) && !(token[1].equals("hamis"))))
            
            {
                System.out.println("Hibas adat, probald ujra"+ sor);
                sor = sc.nextLine();
                token = sor.split(" ");
            }

            Hallgato d = new Hallgato(Integer.parseInt(token[0]), keszult);
            h[i]=d;
            i++;
        }
        
        for(int j=0;j<h.length;j++){
            d1[j]=h[j].dolgozatotIr();
        }
        
         for(int o=0;o<h.length;o++){
            d2[o]=h[o].dolgozatotIr();
            if(d2[o].megfelelt(d2[o]) == d1[o].megfelelt(d1[o]))
                 System.out.println("Megfelelt");
                ;
            if(d1[o].getPontszam()== -1 || d2[o].getPontszam()== -1)
                 System.out.println("Nem írt");
            else
                 System.out.println("Nem felelt meg");
         }
    }

}
