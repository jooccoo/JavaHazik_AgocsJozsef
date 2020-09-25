/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jocó
 */
public class Main {
    public static void main(String[] args) {
        Ital elso = new Ital("Cola", "5dl");
        Ital masodik = new Ital("Cola", "5dl");
        System.out.println(masodik.név);
        System.out.println(masodik.kiszerelés);
        System.out.println(masodik.gyártásiDátum);
        System.out.println(Ital.getÁr());
        Ital.setÁr(150);
        System.out.println(Ital.getÁr());
        if( elso.equals(masodik))
                System.out.println("Equal "); 
        else 
            System.out.println("Not Equal ");
    }
}
