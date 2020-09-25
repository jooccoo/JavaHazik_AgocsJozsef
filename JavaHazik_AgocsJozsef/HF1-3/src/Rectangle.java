/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Ez az osztály egy valós világ beli négysöget és a hozzá tartozó 
 * területi és kerületi számításokat hivatott szimulálni.
 * @author József / WKO7VX
 */
public class Rectangle {
    public double height;
    public double width;
    
    public Rectangle(){
        this.height=1.0;
        this.width=1.0;
    }
    
    public Rectangle(double width, double height){
        this.width=width;
        this.height=height;
    }
    /**
     * Ez a metódus egy négyszög területét számolja ki a 2 oldal hosszából
     * @return - a négyszög területe - magasság*szélesség 
     */
    public double getArea(){
        return this.height*this.width;
    }
    /**
     * Ez a metódus egy négyszög kerületét számolja ki a 2 oldal hosszából.
     * @return - a négyszög kerülte - 2*(magasság+szélesség)
     */
    public double getPerimeter(){
        return 2*(this.height+this.width);
    }

    @Override
    public String toString() {
        return "A teglalap tulajdonsagai: Szelesseg: " + this.width + "; Magassag: " + this.height +"; Terulet: " + this.getArea() + "; Kerulet: " + this.getPerimeter() +"";
    }
    
}
