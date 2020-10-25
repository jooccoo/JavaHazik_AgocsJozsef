/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elso_feladat;
/**
 *
 * @author Jocó
 */
public abstract class Gyumolcsle extends Ital {

    public abstract void Gyumolcsle(Gyümölcs gy);
    
    public abstract String mibolFacsartak();
    public abstract String mibolKeszult();
    public abstract String milyenIzu();

    @Override
    public String toString() {
        return "Gyumolcsle!";
    }
    
    
}