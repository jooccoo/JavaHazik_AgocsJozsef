/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otodik_es_hatodik_Feladat;

import java.util.Random;

/**
 *
 * @author Jocó
 */
public class Test {

    public static void main(String[] args) {
        Random rnd = new Random();
        int[] t = new int[30];
        for (int i = 0; i < t.length; i++) {
            t[i] = rnd.nextInt(10);
        }
        printArray(t);
        long timeStart = System.currentTimeMillis();
        System.out.println(isConsecutiveFour(t));
        insertionSort(t);
        long timeEnd = System.currentTimeMillis();
        printArray(t);
        System.out.println(isConsecutiveFour(t));
        System.out.println(timeEnd - timeStart);
    }

    static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    static void insertionSort(int[] a) {
        for (int j = 1; j < a.length; j++) {
            int key = a[j];
            int i = j - 1;
            while ((i > -1) && (a[i] > key)) {
                a[i + 1] = a[i];
                i--;
            }
            a[i + 1] = key;
        }
    }

    public static boolean isConsecutiveFour(int[] values) {
        if (values.length < 4) {
            return false;
        } else {
            for (int k = 0; k < values.length - 4; k++) {
                if (values[k] == values[k + 1] && values[k] == values[k + 2] && values[k] == values[k + 3]) {
                    return true;
                }
            }
        }
        return false;

    }
}
