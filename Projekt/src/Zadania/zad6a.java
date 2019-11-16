package Zadania;

public class zad6a {
    public static void main(String[] args) {
                                            //NAPISY [String]
        //1 Zadeklaruj napis na dwa znane Ci sposoby.
        String napis1 = "Hello";
        String napis2 = new String("Hello");

        //2 Porównaj ten sam napis używając == oraz .equals
        System.out.println(napis1 == napis2);
        System.out.println(napis1 == "Hello");
        System.out.println(napis2 == new String("Hello"));

        System.out.println(napis1.equals(napis2));
        System.out.println(napis1.equalsIgnoreCase("HELLO"));

        //3 Połącz dwa napisy. (użyj operatora oraz metody)
        System.out.println(napis1 + " " + "World");
        System.out.println(napis1.concat(" ").concat("World2"));
        System.out.println(napis1);

        //4 Usuń białe znaki z napisu.
        String name = "   Magda    ";
        System.out.println(name);
        String cleanName = name.trim();
        System.out.println(name.trim());
        System.out.println(cleanName);
        System.out.println(name.length());
        System.out.println(cleanName.length());

        //5 Zamień duże na małe litery lub na odwrót.
        String x = "A B C";
        System.out.println(x.replace(" ", ""));
        System.out.println(x.replace("A B C", "a b c"));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        //6 Znajdź pozycję danego znaku.
        System.out.println(name.indexOf("g"));
        System.out.println(name.indexOf("X"));

        //7 Podmień wybrany znak
        String nazwax = "Gdzie moj telefon?";
        System.out.println(nazwax.replace("moj", "twój"));

        //8 Wytnij wybrane słowo z napisu(tzn “substring”)
        int poz = 11;
        nazwax = nazwax.substring(0, poz) + "X" +nazwax.substring(poz + 1);
        System.out.println(nazwax);

        String name2 = "Pan Tadeusz";
        System.out.println(name2.substring(6, 8));              //od-do

        //9 Użyj dowolnej metody z wyrażeniem regularnym
        String napis3 = "Ania ma chłopaka 52dni";
        System.out.println(napis3.replaceAll("[2-5]{2}", "10"));
    }
}
