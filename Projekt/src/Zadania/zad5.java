package Zadania;

import java.util.Arrays;

public class zad5 {
    public static void main(String[] args) {

        //1 Stwórz dowolna jednowymiarowa tablice
        int[] array1 = {20, 30, 40, 50};
        System.out.println(Arrays.toString(array1));

        //2 Stwórz dowolna wielowymiarowa tablice, O wymiarach n0 x n … x n L.
        int[][][] array2 = new int[8][7][10];

        //3 Stwórz dowolna tablice ze zdefiniowanymi wartościami.
        int[][] array3 = {
                {1, 2, 3}, {4, 5, 6}
        };
        System.out.println("<----->");
        System.out.println(Arrays.toString(array3[0]));
        System.out.println(Arrays.toString(array3[1]));

        //4 Przypisz dowolną wartość do wybranej komórki tablicy. I ja potem pobierz i wyświetl.
        array3[0][2] = 400;
        System.out.println("<---->");
        System.out.println(Arrays.toString(array3[0]));
        array3[1][0] = 500;
        System.out.println(Arrays.toString(array3[1]));

        array3[1] = new int[]{11, 12, 33};
        System.out.println("<---->");
        System.out.println(Arrays.toString(array3[0]));
        System.out.println(Arrays.toString(array3[1]));

        //5 Wyświetl długość dowolnego wymiaru tablicy.
        System.out.println(array3.length);
        System.out.println(array3[0].length);

        //6 Wyświetl zawartość dowolnej komórki podanej tablicy: int[] x = new int[10];
        int[] x = new int[10];                      //int x[] = new int[10];
        System.out.println(x[5]);

        //7 Stwórz tablice z słowem final.
        final int[] tabfinal = {700, 900, 1100, 1500};

        //8 Spróbuj podmienić komórkę w tablicy zadeklarowanej jako final.
        tabfinal[3] = 33;
        System.out.println(Arrays.toString(tabfinal));
    }
}
