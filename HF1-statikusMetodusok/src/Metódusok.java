/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Ez az osztály 14 különböző valós világ beli feladatot képes modellezni, mint
 * például minimum- és maximum érték keresés, rendezés, szökőév számlálás,
 * Horner-séma, Fibonacci számsorozat, prím szám megállapítás, oszthatóság, stb.
 * @author József / WKO7VX
 */
public class Metódusok {

    public static void main(String[] args) {
        novekvo1(5, 6, 3);
        minMax(-8,5,7);
        rendez3(1, 2, 3, -1);
        System.out.println("4. feladat (haromszog): " + haromszog4(3, 1, 5));
        System.out.println("5. feladat (Szokoev): " + szokoev5(1963, 2020));
        System.out.print("6. feladat (osztalyzat): ");
        switchJegy6(4);
        System.out.println("7. feladat (hanyados): " + osztas7(10, 100));
        System.out.println("8. feladat (prim): " + prim8(111));
        System.out.print("9. feladat (fibonacci): ");
        fibonacci9(10);
        System.out.println("10. feladat (horner): " + horner10(6798));
        System.out.println("11. feladat (faktorialis): " + faktorialis11(12));
        oszto12(2, 8, 2);
        System.out.println("13. feladat (fibonacci): " + fibonacci13(7));;
        keres14();
    }

     /**
     * Ez a statikus eljárás 3 egész értéket képes növekvő sorrendbe állítani,
     * majd a sorbarendezett számokat kiírja a standard kimenetre is.
     */
    public static void novekvo1(int a, int b, int c) {
        int n[] = {a, b, c};
        int csere;
        for (int i = 0; i < n.length - 1; i++) {
            for (int j = i + 1; j < n.length; j++) {
                if (n[i] > n[j]) {
                    csere = n[i];
                    n[i] = n[j];
                    n[j] = csere;
                }
            }
        }
        System.out.print("1. feladat (novekvo): ");
        for (int k = 0; k < n.length; k++) {
            System.out.print(n[k] + ", ");
        }
        System.out.println();
    }
    
    /**
     *  Ez a statikus eljárás 3 egész értékből képes kiválasztani egyrészt  a 
     *  legkisebb értéket, másrészt az abszolút legnagyobb értéket.
     *  Az eredményeket kiírja a standard kimenetre.
     */
    public static void minMax(int a, int b, int c) {
        int n[] = {a, b, c};
        int min = a;
        int absolutMax = min;
        for (int i=1; i<3; i++){
            if(min > n[i])
                min=n[i];
        }
        if(min<0)
                absolutMax=-1*min;
        for (int j=1; j<3; j++){
            if(absolutMax < n[j])
                absolutMax=n[j];
        }
        System.out.println("2. feladat (min-absMax): min="+min+", abszolut max="+absolutMax);
    }

    /**
     * Ez a statikus eljárás 4 egész értéket képes kezelni. Annak megfelelően
     * változik az értékek kiírásának a sorrendje, hogy a d >= 0 vagy pedig d<0.
     */
    public static void rendez3(int a, int b, int c, int d) {
        if (d >= 0) {
            System.out.println("3. feladat (csere): " + a + ", " + c + ", " + b + ", " + d);
        } else {
            System.out.println("3. feladat (csere): " + a + ", " + b + ", " + d + ", " + c);
        }
    }

    /**
     * Ez a statikus metódus megállapítja 3 számról, hogy lehetséges-e belőlük
     * egy háromszöget rajzolni, ha a 3 változóban megadott érték a 
     * háromszög oldalainak hosszát képviseli. Egy háromszög akkor megrajzolható,
     * ha bármelyik két oldal hosszának összege nagyobb, mint a harmadik oldal.
     * 
     * @return - true, ha létezik ilyen háromszög, false, ha nem létezik.
     */
    public static boolean haromszog4(double a, double b, double c) {

        if ((a < b + c) && (b < a + c) && (c < a + b)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Ez a statikus függvény megállapítja, hogy hány darab szökőév volt a
     * paraméterként megadott 2 évszám között. Egy év akkor szökőév, ha az
     * osztható 4-gyel és osztható 400-zal vagy nem osztható 100-zal.
     * 
     * @return - A két évszám közötti szökőévek száma
     */
    public static int szokoev5(int start, int end) {
        int db = 0;
        int tmp;

        if (start > end) {
            tmp = start;
            start = end;
            end = tmp;
        }

        while (start <= end) {
            if ((start % 4 == 0) && (start % 100 != 0) || (start % 400 == 0)) {
                db++;
            }
            start++;
        }

        return db;

    }
    /**
     * Ez a statikus eljárás egy 1-től 5-ig terjedő osztályzatot képes kiírni
     * szöveges formátumban a standard kimenetre is. Ha a szám nem 1,2,3,4 vagy 5
     * akkor egy figyelmeztetést ír ki a standard kimenetre.
     */
    public static void switchJegy6(int jegy) {

        switch (jegy) {

            case 1:
                System.out.println("elégtelen");
                break;

            case 2:
                System.out.println("elégséges");
                break;

            case 3:
                System.out.println("közepes");
                break;

            case 4:
                System.out.println("jó");
                break;

            case 5:
                System.out.println("jeles");
                break;

            default:
                System.out.println("Nincs ilyen osztalyzat!");
                break;
        }
    }

    /**
     * Ez a statikus metódus 2 szám egész hányadosát állapítja meg 
     * folyamatos kivonással. Ha az "a" változó kisebb, mint a "b"
     * változó, akkor a függvény felcseréli a 2 változót és így
     * állapítja meg az egész hányadost
     * 
     * @return - A paraméterben megadott 2db természetes szám egész hányadosa 
     */
    public static int osztas7(int a, int b) {
        int hanyados = 0;
        int tmp;
        if (a < b) {
            tmp = a;
            a = b;
            b = tmp;
        }

        while (a >= b) {
            hanyados++;
            a = a - b;
        }
        return hanyados;

    }

    /**
     * Ez a statikus metódus megállapítja  a paraméterként megadott számról,
     * hogy az prím-e vagy sem. A függvény az alapján számol, hogy van-e
     * a paraméterként megadott számnak maradék nélküli osztója 2 és a szám
     * négyzetgyöke között.
     * 
     * @return - Igaz, ha a szám prím, hamis, ha a szám 0,1 vagy nem prím. 
     */
    public static boolean prim8(int szam) {
        if (szam == 0 || szam == 1) {
            return false;
        } else {
            for (int j = 2; j <= Math.sqrt(szam); j++) {
                if (szam % j == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Ez a statikus eljárás a Fibonacci sorozat első n darab elemét írja ki a 
     * standard kimenetre, a két segédváltozós algoritmus alapján.
     */
    public static void fibonacci9(int n) {
        int a = 1;
        int b = 0;

        for (int i = 0; i < n; i++) {

            System.out.print(b + ", ");
            b = a + b;
            a = b - a;
        }
        System.out.println();
    }

    /**
     * Ez a statikus metódus egy paraméterként megadott számot képes számjegyenként
     * megfordítani a Horner-séma szerint.
     * 
     * @return - A paraméterként megadott szám számjegyenként fordított sorrendben. 
     */
    public static int horner10(int n) {
        int uj = 0;

        while (n != 0) {
            uj = uj * 10 + (n % 10);
            n = n / 10;
        }
        return uj;
    }

    /**
     * Ez a statikus metódus kiszámolja és kiírja egy szám faktoriális értékét.
     * Az unsigned long típus miatt, a 12-től nagyobb számokra 0 értéket ad vissza.
     * 
     * @return - a paraméterként megadott szám faktoriális értéke
     */
    public static long faktorialis11(long n) {
        if (n > 12) {
            return 0;
        } else {
            long k = n;
            for (int i = 1; i < k; i++) {
                n *= i;
            }
            return n;
        }

    }

    /**
     * Ez a statikus eljárás egy paraméterként megadott n1 és n2 szám között
     * megkeresi és kiírja a standard kimenetre a szintén paraméterként megadott 
     * k-val osztható összes számot. Az n1 és n2 érték felcserélhető, az eljárás 
     * meg tudja cserélni az értékeket, ha n1>n2.
     */
    public static void oszto12(int n1, int n2, int k) {
        int tmp;
        if (n1 > n2) {
            tmp = n1;
            n1 = n2;
            n2 = tmp;
        }
        System.out.print("12. feladat (k-val oszthato): ");
        while (n1 <= n2) {
            if (n1 % k == 0) {
                System.out.print(n1 + ", ");
            }
            n1++;
        }
        System.out.println();
    }

    /**
     * 
     * Ez a statikus metódus a paraméterként megadott számtól nagyobb
     * következő legkisebb Fibonacci számot tudja kiírni a standar kimenetre
     * A metódus a két segédváltozós algoritmus alapján számol.
     * 
     * @return - az n-től nagyobb legkisebb Fibonacci szám
     */
    public static int fibonacci13(int n) {
        int a = 1;
        int b = 0;

        for (int i = 0; n >= b; i++) {
            b = a + b;
            a = b - a;
        }
        return b;
    }

    /**
     * Ez a statikus metódus kiírja az összes olyan számot a standard kimenetre,
     * amelyek megegyeznek a számjegyei köbének összegével.
     * A metódus a Horner sémára épül, a 10-zel való maradékos osztással
     * nyeri ki a szükséges számjegyeket.
     */
    public static void keres14() {
        System.out.print("14. feladat (szamkereses): ");
        for (int n = 1; n < 1000; n++) {
            int tmp = n;
            int szamjegy = 0;
            int osszeg = 0;

            while (tmp != 0) {
                szamjegy = tmp % 10;
                tmp = tmp / 10;
                osszeg = osszeg + (szamjegy * szamjegy * szamjegy);
            }
            if (osszeg == n) {
                System.out.print(n + ", ");
            }
        }
        System.out.println();
    }

}
