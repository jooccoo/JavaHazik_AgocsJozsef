/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nyolcadik_feladat;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Jocó
 */
public class Main {
    
        public static void kiir(Fejesek[] t) {
        for (int i = 0; i < t.length; i++) {
            System.out.println(t[i]);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ISO-8859-2");
        int db = Integer.parseInt(sc.nextLine());
        Fejesek[] tomb = new Fejesek[db];
        String sor = null;
        int i;
        tomb=new Fejesek[db];
        
        for(i=0;i<db;i++)
        {
            sor = sc.nextLine();
            String[] token = sor.split(";");
            Fejesek f=new Fejesek(token[0], Integer.parseInt(token[1]), Integer.parseInt(token[2]), Integer.parseInt(token[3]));
            f.setAkciogol(f.getOsszgol()-f.getSzabadrugas()-f.getBunteto());
            f.setFejgol(f.getAkciogol()*0.2+f.getSzabadrugas()*0.4);
            tomb[i]=f;
        }
        
        Arrays.sort(tomb);
        kiir(tomb);
        }
}
