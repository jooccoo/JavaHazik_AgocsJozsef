package negyedik_feladat;

import java.util.Date;
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jocó
 */
public class Autó {

    private String rendszám;
    private int motorTeljesítmény;
    private Date gyártásDátuma;

    public Autó(String rendszám, int motorTeljesítmény) {
        this.rendszám = rendszám;
        this.motorTeljesítmény = motorTeljesítmény;
        this.gyártásDátuma = new Date();
    }

    public String getRendszám() {
        return rendszám;
    }

    public int getMotorTeljesítmény() {
        return motorTeljesítmény;
    }

    public Date getGyártásDátuma() {
        return gyártásDátuma;
    }

    public void setRendszám(String rendszám) {
        this.rendszám = rendszám;
    }

    @Override
    public String toString() {
        return "Autó rendszama: " + this.rendszám + ", Teljesítmény: " + this.motorTeljesítmény;
    }


}