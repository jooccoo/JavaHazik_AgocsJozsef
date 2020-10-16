/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elso_es_masodik_feladat;

/**
 *
 * @author Jocó
 */
public class TestTriangle {
    public static void main(String[] args) {
        Triangle h = new Triangle(1, 1.5, 1);
        h.setColor("yellow");
        h.setFilled(true);
        System.out.println(h);
        System.out.println("Area: "+h.getArea());
        System.out.println("Perimeter: "+h.getPerimeter());
        System.out.println("Color: "+ h.getColor() +" Filled: "+h.isFilled());
    }
}
