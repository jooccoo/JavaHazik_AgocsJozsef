/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/** Ez az osztály egy valós világ beli szabályos sokszöget és a hozzá tartozó
 * terület és kerület számításokat szeretné szimulálni.
 * A sokszög oldalanak száma, hossza, területe és kerülete a standard kimenetre
 * íródik.
 *
 * @author József / WKO7VX
 */
public class RegularPolygon {

    private int n;
    private double side;
    private double x;
    private double y;

    public RegularPolygon() {

        this.n = 3;
        this.side = 1;
        this.x = 0;
        this.y = 0;
    }

    public RegularPolygon(int n, double side) {
        this.n = n;
        this.side = side;
        this.x = 0;
        this.y = 0;
    }

    public RegularPolygon(int n, double side, double x, double y) {

        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    /**
     * Ez a metódus kiszámolja a szabályos szöksög kerületét az oldalak számából
     * és az oldalak hosszából.
     *
     * @return - a szabályos sokszög kerülete
     */
    public double getPerimeter() {
        return this.n * this.side;
    }

    /**
     * Ez a metódus képes kiszámolni egy szabályos n-oldalú sokszög területét
     * úgy, hogy elsőnek kiszámolja a szükséges szöget, majd a szög tangensét
     *
     * @return - a szabályos sokszüg területe
     * (oldalszam*oldalszam*oldalhossz)/(4*angle)
     */
    public double getArea() {
        double angle = Math.PI / this.n;
        angle = Math.tan(angle);
        return ((this.side * this.side * this.n) / (4.0 * angle));
    }

    @Override
    public String toString() {
        return "A sokszog tulajdonsagai: oldalszam: " + this.n + ", oldalhossz: " + this.side + "\nközéppont: [" + this.x + ", " + this.y + ']';
    }

}
