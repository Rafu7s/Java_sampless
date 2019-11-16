package Zadania;

public class zad1 {
    public static void main(String[] args) {

        // 1 Przetestuj przypisanie do zmiennej a potem przypisanie zmiennej do zmiennej innego typu.
        int zmienna = 16;
        long innazmienna = 20;

        //2 Przetestuj użycie niepoprawnej zmiennej(zbyt duża wartość).
        // byte niepoprawna = 127;

        //3  Przetestuj korzystanie z symboli D, F, L.
        float przecinkowapojedyncza32bit = 1.35f;
        double przecinkowapodwojna64bit = 10.5d;
        long pozazakres = 9_223_372_036_854_775_807l;

        //4 Przetestuj przypisywanie wartości do char.
        char unicode = 15;

        //5 Przypisz char do zmiennej liczbowej.
        int przypisaniechar = unicode;

        //6 Nadpisz zmienna.
        System.out.println(przypisaniechar);
        przypisaniechar = przypisaniechar + 1;
        System.out.println(przypisaniechar);

        //7 Stwórz stałą dowolnego typu korzystając z pojedynczego wyrażenia.
        final float C1 = 5.12f;
        System.out.println(C1);

        //8 Stwórz stałą dowolnego typu korzystając z podwójnego wyrażenia
        final double C2;
        C2 = 8.15d;
        System.out.println(C2);
    }
}
