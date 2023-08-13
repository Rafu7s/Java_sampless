package dev.Zadania_presentation;

public class Zad11b {
    public static void main(String[] args) {
                                //Do While
        /*
        - Wypisz cyfry od 1 do 10 włącznie.
        - Wypisz cyfry od 10 do 1 włącznie.
        - Wypisz cyfry parzyste nie korzystając z if;a.
         */
     int b = 1;
     do {
        System.out.print(b + " ");
        b++;
    } while (b <= 10);

        System.out.println();
        b = 10;
        do {
            System.out.print(b + " ");
            b--;
        } while (b >= 1);

System.out.println();
    b = 0;
    do {
        System.out.print(b + " ");
        b += 2;
    } while (b <= 20);

    }
}
