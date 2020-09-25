/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Ez az osztály a LinearEquation osztály tesztelésére szolgál.
 * A példányokban paraméterként megadott változókból eldönti, hogy
 * az adott egyenletrendszer megoldható-e, és ha igen, akkor kiírja az egyenlet
 * rendszer megoldását X-re és Y-ra. Ha nem oldható meg az egyenlet, akkor egy
 * hibaüzenet tájékoztatja a felhasználót.
 *
 * @author József / WKO7VX
 */
public class Main {
    public static void main(String[] args) {
        LinearEquation n1 = new LinearEquation (1,1,1,2,3,4);
        LinearEquation n2 = new LinearEquation (0,0,0,-2,1,8);
        LinearEquation n3 = new LinearEquation (3,-1,-5,3,4,5);
        if (n1.isSolvable())
            System.out.println("Megoldas: x= "+n1.getX()+", y= "+n1.getY());
        else
            System.out.println("The equation has no solution.");
         if (n2.isSolvable())
            System.out.println("Megoldas: x= "+n2.getX()+", y= "+n2.getY());
        else
            System.out.println("The equation has no solution.");
         if (n3.isSolvable())
            System.out.println("Megoldas: x= "+n3.getX()+", y= "+n3.getY());
        else
            System.out.println("The equation has no solution.");
    }
    
    
}
