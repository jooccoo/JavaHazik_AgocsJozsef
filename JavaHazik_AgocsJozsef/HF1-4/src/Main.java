/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Ez az osztály a már meglévő Ital osztály tesztelését hivatott elvégezni
 * @author József / WKO7VX
 */
public class Main {

    public static void main(String[] args) {
        Ital elso = new Ital("Cola", "5dl");
        Ital masodik = new Ital("Cola", "5dl");
        System.out.println(Ital.getÁr()+"Ft");
        Ital.setÁr(450);
        System.out.println(Ital.getÁr()+"Ft");
        System.out.println(Ital.getÁrEuróban()+" EURO");
        System.out.println(elso);
        System.out.println(masodik);
        if (elso.equals(masodik)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}
