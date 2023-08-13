package dev.Zadania_presentation;

public class zad7 {

    public static void main(String[] args) {

        // Stwórz pusty obiekt.
        StringBuilder xyz = new StringBuilder(" ");
        System.out.println(xyz);

        // Stwrzów obiekt na podstawie istniejącego napisu.
        StringBuilder nowy = new StringBuilder("Witaj");
           System.out.println(nowy);

        // Dodaj jakis napis na końcu.
        nowy.append(" Człowieku");
        System.out.println(nowy);

        // Dodaj jakis napis w środku
        nowy.insert(6, "X");
        System.out.println(nowy);

        // Podmień część napisu.
        nowy.replace(6, 16, "Kobieto");
        System.out.println(nowy);

        // Zamień Obiekt na String.
        String nazwa = nowy.toString();
        System.out.println(nazwa);

        // Porównaj ze stringiem.
        System.out.println(nazwa.equals(nowy));
        System.out.println(nowy.equals(nazwa));

        StringBuilder builder1 = new StringBuilder();
        StringBuilder builder2 = new StringBuilder();
        System.out.println(builder1.equals(builder2));
        System.out.println(builder1.equals(builder1));
    }
}
