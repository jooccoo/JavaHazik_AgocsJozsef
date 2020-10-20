/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hetedik_feladat;

import java.util.Scanner;

/**
 *
 * @author Jocó
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ISO-8859-2");
        String sor = "";
        
        while (!sor.equals("0") ){
            sor = sc.nextLine();
            int osszeg=0;
            int[] szamok = new int[16];
            char felbont [] = sor.toCharArray();
            for (int i = 0; i<felbont.length;i++){
                szamok[i]= Character.getNumericValue(felbont[i]);
            }
            for(int j =15; j>=0;j--){
                
                if( j%2 == 0 || j==0){
                    szamok[j]=szamok[j]*2;
                    if(szamok[j] >= 10){
                        osszeg=osszeg+szamok[j]/10+szamok[j]%10;
                    }
                    else
                        osszeg=osszeg+szamok[j];
                }
                else
                        osszeg=osszeg+szamok[j];
            }
            if(osszeg%10 ==0 && osszeg !=0 && szamok.length==16)
                System.out.println("YES");
            else if(!sor.equals("0"))
                System.out.println("NO");
        }
    }
    
}
