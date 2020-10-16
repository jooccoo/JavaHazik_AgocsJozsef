/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negyedik_feladat;

/**
 *
 * @author Jocó
 */
public class Test {

    public static void rendezMaxSzállíthatóTeherCSökkenőleg(Teherautó[] teher) {
        for (int i = 0; i < teher.length - 1; i++) {
            for (int j = i+1; j < teher.length; j++) {
                if (teher[i].getMaxSzállíthatóTeher() < teher[j].getMaxSzállíthatóTeher()) {
                    Teherautó tmp = teher[i];
                    teher[i] = teher[j];
                    teher[j] = tmp;
                }
            }
        }

        for (int k = 0; k < teher.length; k++) {
            System.out.println(teher[k]);
        }
    }

    public static void keresMaxMotorTeljesítmény(Autó[] auto) {
        int max = auto[0].getMotorTeljesítmény();
        int index_hely = 0;
        for (int i = 1; i < auto.length; i++) {
            if (max == auto[i].getMotorTeljesítmény()) {
                if (auto[index_hely].getRendszám().compareTo(auto[i].getRendszám()) != 0) {
                    max = auto[i].getMotorTeljesítmény();
                    index_hely = i;
                }
            }
            if (auto[i].getMotorTeljesítmény() > max) {
                max = auto[i].getMotorTeljesítmény();
                index_hely = i;
            }
        }
        System.out.println("A legnagyobb teljesítményű autó: " + auto[index_hely].getRendszám() + ", teljesítmény: " + auto[index_hely].getMotorTeljesítmény());
    }

    public static void main(String[] args) {
        Autó[] auto = new Autó[]{
            new Autó("KMM-422", 1000),
            new Autó("KZS-564", 1400),
            new Autó("KVH-190", 1400),
            new Autó("HOE-420", 5000),
            new Autó("ANY-118", 5000),
            new Teherautó("HER-222", 3000, 3500),
            new Teherautó("YEH-999", 2800, 3200),
            new Teherautó("AAA-123", 5000, 4500),
            new Teherautó("ZSA-001", 4000, 4800),
            new Teherautó("OHH-720", 3900, 7000),};

        Teherautó[] teher = new Teherautó[]{
            new Teherautó("HER-232", 3000, 1),
            new Teherautó("YEH-919", 2800, 2),
            new Teherautó("AAA-143", 5000, 3),
            new Teherautó("ZSA-011", 4000, 4),
            new Teherautó("OHH-710", 3900, 5),
            new Teherautó("HIM-222", 3000, 6),
            new Teherautó("YAH-999", 2800, 7),
            new Teherautó("ABA-123", 5000, 8),
            new Teherautó("ZEA-001", 4000, 9),
            new Teherautó("OGH-720", 3900, 10),};
        keresMaxMotorTeljesítmény(auto);
        rendezMaxSzállíthatóTeherCSökkenőleg(teher);
    }
}
