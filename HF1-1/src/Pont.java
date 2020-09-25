/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Ez az osztály egy xy kordináta rendszert hivatott modellezni.
 * @author József / WKO7VX
 */
public class Pont {
    
    private double pontX;
    private double pontY;
    
    public Pont()
    {
        this.pontX=0;
        this.pontY=0;
        
    }
    public Pont(double pontX, double pontY)
    {
        this.pontX=pontX;
        this.pontX=pontY;
    }
    
    public double getX()
    {
        return this.pontX;
    }
    public double getY()
    {
        return this.pontY;
    }
    
    public void setX(double pontCopyX)
    {
        this.pontX=pontCopyX;
    }
    public void setY(double pontCopyY)
    {
        this.pontY=pontCopyY;
    }
    
}
