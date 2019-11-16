package dev.Zadania_presentation;

public class zad9 {
    public static void main(String[] args) {
                                    //Switch

        // Zdefiniuj switch z co najmniej dwoma “przypadkami” bez słowa kluczowego default.
        int bb = 10;
            switch (bb) {
                case 1: System.out.println("jedynka");
                break;
                case 2: System.out.println("dwojka");
               }

            // Zdefiniuj switch bez użycia break pomiędzy dwoma przypadkami.
           /*        int by = 3;
                     final int five = 50;
                switch (by) {
                // Wartość przypadku przenieść do zmiennej.
                case five: System.out.println("piec");
                case 3: System.out.println("trzy");
                default: System.out.println("default");
            }
                */

            // Uruchom przekazując wartość nie obsłużoną przez zdefiniowane “przypadki”
             int by = 20;
            //Dodaj słowo final przed nazwa nowo utworzonej zmiennej.
            final int five = 50;
            switch (by) {
                // Wartość przypadku przenieść do zmiennej.
                case five: System.out.println("piec");
                break;
                case 3: System.out.println("trzy");
                break;
                default: System.out.println("default");
                break;
            }
        // Uruchom przekazując wartość odpowiednią dla pierwszego “przypadku”.
        //int by = 50;
        //int by = 3;
    }
}





