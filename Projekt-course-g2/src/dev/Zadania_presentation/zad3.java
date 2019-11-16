package dev.Zadania_presentation;

public class zad3 {
    public static void main(String[] args) {

        //1 Przetestuj rzutowanie (castowanie) większego typu do mniejszego
        long x = 123;
        int y = (int) x;
        System.out.println(y);

        //2 Przetestuj rzutowanie większego typu do mniejszego, gdzie w typie większym
        //aktualna wartość przekracza zakres typu mniejszego.
        int c1 = 140;
        byte c2 = (byte) c1;
        System.out.println(c2);

        //3 Przetestuj rzutowanie do booleana.
        System.out.println(7 ^ 2);  //decimal to binary
        //  boolean b = (boolean)i2;
    }
}
