package Zadania;

import java.util.Arrays;

public class Taski {

    public static void main(String[] args) {

        //      - Stwórz napis "Jakis dowolny tekst"
        String napis = "Papa smerf i Gargamel";
        System.out.println(napis);

        //Zamien na tablice znaków (toCharArray())
        char[] chars = napis.toCharArray();
        System.out.println(chars);

        //Znajdz przy pomocy petli pierwsza pozycje znaku 'o'
        int firstposition = -1;
        for (int i = 0; i < chars.length; i++) {
            // napis.charAt(i)
            if (chars[i] == 's') {
                firstposition = i;
                break;
            }
        }
        System.out.println(firstposition);

        //Wygeneruj string z alfabetem "A...Z"

        String s = "";
        for (char c = 'A'; c <= 'Z'; c++) {
            s += c;
        }
        System.out.print(s);

        System.out.println();
        //Stworz tablice 10 kolejnych  wielokrotoności liczby 2
        int[] tab = new int[10];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = 2 * i;
        }
        System.out.print(Arrays.toString(tab));

        System.out.println();
        System.out.println("<-------------->");
        //Stworz tabliczke mnozenia o wymiarach NxM
        int m = 5;
        int n = 10;
        int[][] result = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = i * j;
            }
        }
        for (int i = 0; i < m; i++) {
            System.out.println(Arrays.toString(result[i]));
        }

        System.out.println("<-------------->");
        //Przy pomocy petli podnieś liczbe a do potegi b
        int a = 3;
        int b = 4;

        int wynik = 1;
        for (int i = 0; i < b; i++) {
            wynik = wynik * a;
        }
        System.out.print(wynik);

        System.out.println();
        System.out.println("<-------------->");
            /*Stworz tablice z 1 na dwóch przekątnych
            10001
            01010
            00100
            01010
            10001
             */
        int X = 5;
        int[][] tab2 = new int[X][X];

        int n2 = X-1;
        for (int i = 0; i < X; i++) {
            tab2[i][i] = 1;
            tab2[i][n2-i] = 1;
        }
        for (int i = 0; i < X; i++) {
            System.out.println(Arrays.toString(tab2[i]));
        }
    }
}
