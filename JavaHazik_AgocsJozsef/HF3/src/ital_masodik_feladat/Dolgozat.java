/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ital_masodik_feladat;

import java.util.Arrays;

/**
 *
 * @author Jocó
 */
public class Dolgozat {
    
    public static SzeszesItal [] legmagasabbAlkoholTartalom(Ital [] k){
        int db=0;
        int index=0;

        for(int i =0;i<k.length;i++){
            if(k[i] instanceof SzeszesItal )
                db++;
        }
        
        if(db < 3)
            return null;
        else
        {
            SzeszesItal a [] = new SzeszesItal [db];
            for(int j =0;j<k.length;j++){
                if(k[j] instanceof SzeszesItal ){
                    SzeszesItal tmp= (SzeszesItal)k[j];
                    a[index]=tmp;
                    index++;
                }
                 
        }
            
            for(int m=0;m<db-1;m++){
                for(int n=m+1;n<db;n++){
                  if(a[m].getAlkoholTartalom() < a[n].getAlkoholTartalom()){
                    SzeszesItal tmp = a[m];
                    a[m] = a[n];
                    a[n] = tmp;  
                }
            }
        
        
        }
        return a;
        }  
    }
    
    public static void rendez (Ital[] k){
        for(int i=0;i<k.length-1;i++){
            for(int j=i+1;j<k.length;j++){
                if(k[i].compareTo(k[j]) > 0){
                    Ital tmp= k[i];
                    k[i] = k[j];
                    k[j] = tmp;
                }
                    
            }
        }
    }
    
    public static void kiir(Ital [] a){
    for(int i=0;i<a.length;i++)
            System.out.println(a[i]);
    
    }
    
    public static void main(String[] args) {
        
        Ital b [] = new Ital []{
        new Ital("Coca-cola", "5 dl", 150),
        new Ital("Fanta", "5 dl", 140),
        new Ital("Pepsi", "5 dl", 145),
        new SzeszesItal(4.2, "Borsodi", "3 dl", 200),
        new SzeszesItal(4.5, "Heineken", "3 dl", 300),
        new SzeszesItal(7.1, "Fehérbor - Édes", "1 dl", 500),
        
        };
        if(legmagasabbAlkoholTartalom(b) != null)
            kiir(legmagasabbAlkoholTartalom(b));
        rendez(b);
        System.out.println("------------------------------------");
        kiir(b);
    }
    
}
