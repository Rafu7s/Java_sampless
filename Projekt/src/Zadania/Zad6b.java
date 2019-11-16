package Zadania;

public class Zad6b {

    public static void main(String[] args) {

        //1 Czy napis jest palindromem.
        //Nie, chyba ze sie go czyta tak samo od konca.

        //2. Odwróć napis.
        String napisx = "Ala ma kota";
        System.out.println(napisx);
        StringBuilder ss = new StringBuilder(napisx);
        String wynik = ss.reverse().toString();
        System.out.println(wynik);

        //3. Dla podanego napisu wyświetl wszystkie cyfry będące wewnątrz.
        //nie wiem jak to zrobic
        String napisx2 = "Ala ma 20 kota";
        System.out.println(napisx2.substring(7, 9));

        // 4. Czy znak znajduje się w tablicy znaków.
        //nie wiem jak to zrobic
        int[] tabela = {5, 10, 20, 50};
        System.out.println(tabela.toString());
        System.out.println(tabela.equals("5"));
        System.out.println("tabela".contains("5"));
    }
}
