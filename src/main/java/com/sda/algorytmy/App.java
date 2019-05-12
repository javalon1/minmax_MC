package com.sda.algorytmy;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {


        int[] a = {4, 6, 2, 1, 3};

        System.out.println("minimalna liczba: " + min(a));
        System.out.println("maksymalna liczba: "+ max(a));
    }

    public static int min(int[] a) {
        int wynik = a[1];

        for (int i = 0; i <= a.length; i++) {
            if (a[i] < wynik) {
                wynik = a[i];
            } else {
                i++;
            }
        }
        return wynik;
    }

    public static int max(int[] a) {
        int wynik = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > wynik) {
                wynik = a[i];
            }
        }
        return wynik;
    }
}