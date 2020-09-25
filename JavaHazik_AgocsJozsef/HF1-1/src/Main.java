/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Ez az osztály egy létrehozott Pont koordinátáit képes getterek és setterek
 * segítségével módosítani.
 *
 * @author József / WKO7VX
 */
public class Main {

    public static void main(String[] args) {

        Pont x1 = new Pont(1, 2);
        Pont x2 = new Pont(2, 3);
        Pont x3 = new Pont(6, 4);
        Pont x4 = new Pont(5, 6);

        x1.setY(x1.getY() + 5);
        x2.setY(x2.getY() + 5);
        x3.setX(x3.getX() - 3.4);
        x4.setX(x4.getX() - 3.4);

        System.out.println("1.koordinata: [" + x1.getX() + ", " + x1.getY() + "]");
        System.out.println("2.koordinata: [" + x2.getX() + ", " + x2.getY() + "]");
        System.out.println("3.koordinata: [" + x3.getX() + ", " + x3.getY() + "]");
        System.out.println("4.koordinata: [" + x4.getX() + ", " + x4.getY() + "]");

    }
}
