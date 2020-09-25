/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Ez az osztály a valós világ beli másodfokú egyenleteket képes megoldani
 * a hozzá tartozó megoldóképlet alapján.
 * @author József / WKO7VX
 */
public class QuadraticEquation {
    private double a;
    private double b;
    private double c; 

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    /**
     * Ez a metódus a másodfokó egyenlet diszkriminánsát adja meg, azaz
     * a gyökjel alatt lévő egyenlet megoldását.
     * 
     * @return - az egyenlet diszkriminánsa  = b*b-4*a*c
     */
    public double getDiscriminant()
    {
       return (this.b*this.b)-(4 * this.a*this.c);
    }
    
    /**
     * Ez a metódus a másodfokú egyenlet egyik gyökét számolja ki, abban az
     * esetben, ha az egyenlet diszkriminánsa nem 0. Ha a diszkrimináns nem
     * pozitív, akkor 0-t ad vissz a függvény
     * 
     * @return - a másodfokú egyenlet egyik gyöke 
     */
    public double getRoot1()
    {
        if(this.getDiscriminant()> 0)
            return (-this.b+Math.sqrt(this.getDiscriminant()))/(2*this.a);    
        else
            return 0;
    }
    
    /**
     * Ez a metódus a másodfokú egyenlet egyik gyökét számolja ki, abban az
     * esetben, ha az egyenlet diszkriminánsa nem 0. Ha a diszkrimináns 0, akkor
     * az egyenletnek egyetlen gyöke lesz. Ha a diszkrimináns kisebb 
     * mint 0, akkor akkor 0-t ad vissz a függvény.
     * @return - A másodfokú egyenlet másik vagy egyetlen gyöke
     */
       public double getRoot2()
    {
        if(this.getDiscriminant()> 0)
            return (-this.b-Math.sqrt(this.getDiscriminant()))/(2*this.a);

        else if (this.getDiscriminant()== 0)
            return (-this.b)/(2*this.a);
        else
            return 0;
    }

    @Override
    public String toString() {
        return "Az egyenlet gyökei: " + "x1=" + this.getRoot1() + ", x2=" + this.getRoot2() + "";
    }
       
}
