/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Ez az osztály a már meglévő RegularPolygon osztály tesztelésére szolgál.
 *
 * @author József / WKO7VX
 */
public class Teszt {

    public static void main(String[] args) {
        RegularPolygon x1 = new RegularPolygon();
        RegularPolygon x2 = new RegularPolygon(6, 4);
        RegularPolygon x3 = new RegularPolygon(10, 4, 5.6, 7.8);
        System.out.println(x1);
        System.out.println("1.polygon kerulet: " + x1.getPerimeter() + ", Terulet: " + x1.getArea());
        System.out.println(x2);
        System.out.println("2.polygon kerulet: " + x2.getPerimeter() + ", Terulet: " + x2.getArea());
        System.out.println(x3);
        System.out.println("3.polygon kerulet: " + x3.getPerimeter() + ", Terulet: " + x3.getArea());
    }
}
