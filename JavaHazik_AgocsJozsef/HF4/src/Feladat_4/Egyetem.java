/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat_4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jocó
 */
public class Egyetem implements Comparable<Egyetem>{
    private List<Oktató> oktató;
    private List<Hallgató> hallgató;

    public Egyetem() {
        
        this.oktató = new ArrayList<Oktató>();
        this.hallgató = new ArrayList<Hallgató>();
    }

    public List<Oktató> getOktató() {
        return oktató;
    }

    public List<Hallgató> getHallgató() {
        return hallgató;
    }
  
    
    

}
