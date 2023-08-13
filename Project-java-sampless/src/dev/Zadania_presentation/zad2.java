package dev.Zadania_presentation;

public class zad2 {
    public static void main(String[] args) {

        //1 Przetestuj przypisanie przy pomocy underscore (podkreslenie _) oraz literałów hex, bin, octa.
        double x = 13_000;
        System.out.println(x);

        //szesnastkowy 0x - hex  converter: https://www.rapidtables.com/convert/number/hex-dec-bin-converter.html [167]
        double r = 0xA7;
        System.out.println(r);

        //oktalny - ósemkowy, octa - cyfry 0-7 [1056967476]
        int oktalne = 07700_005464;
        System.out.println(oktalne);

        //zapis binarny 0B [100]
        int binarny = 0B1100100;
        System.out.println(binarny);
    }
}
