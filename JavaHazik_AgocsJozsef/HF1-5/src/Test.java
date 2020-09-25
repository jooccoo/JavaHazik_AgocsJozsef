/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *  Ez az osztály a QuadraticEquation osztály helyes működését teszteli, a 
 * 3 lehetséges kimenettel.
 * Első esetben 2 gyök létezik, és mindkét gyök kiírásra kerül a kimenetre.
 * Második esetben a diszkrimináns 0, egyetlen gyök van és csak ez kerül kiírásra.
 * Harmadik esetben nincsenek valós gyökök, egy hibaüzenet kerül kiírásra.
 * 
 * @author József / WKO7VX
 */
public class Test {
    public static void main(String[] args) {
        QuadraticEquation num1 = new QuadraticEquation(5, 3, -2);
        QuadraticEquation num2 = new QuadraticEquation(1, 4, 4);
        QuadraticEquation num3 = new QuadraticEquation(5, -4, 8);
        if(num1.getDiscriminant() > 0)
            System.out.println(num1);
        else if(num1.getDiscriminant() == 0 )
            System.out.println("Az egyenlet gyöke: x= "+ num1.getRoot2() +"");
        else
            System.out.println("The equation has no roots.");
        
        if(num2.getDiscriminant() > 0)
            System.out.println(num2);
        else if(num2.getDiscriminant() == 0)
            System.out.println("Az egyenlet gyöke: x= "+ num2.getRoot2() +"");
        else
            System.out.println("The equation has no roots.");
    
        if(num3.getDiscriminant() > 0)
            System.out.println(num3);
        else if(num3.getDiscriminant() == 0)
            System.out.println("Az egyenlet gyöke: x= "+ num3.getRoot2() +"");
        else
            System.out.println("The equation has no roots.");
    }
    
}
