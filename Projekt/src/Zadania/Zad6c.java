package Zadania;

public class Zad6c {
    public static void main(String[] args) {

                                        // Znaki specjalne
        String t1 = "\tMarek to wsiur i pijak";      //tabulator
        System.out.println(t1);

        String t2 = "Marek\' to wsiur i pijak";      //cudzyslow
        System.out.println(t2);

        String t3 = "Marek to wsiu\nr i pi\njak";        //nowy wiersz
        System.out.println(t3);

        String t4 = "Marek\" to w\"siur i pijak";       //podwojny cudzyslow
        System.out.println(t4);

        System.out.println("Tym razem Ci nie \r daruje");    //ucina wczesniejszy tekst

        System.out.println("Tym razem Ci nie\b daruje");     //cofa-kasuje 1 znak

        System.out.println("Pan Kleks\b".length());          //znak tez sie wlicza

        System.out.println("\777");                 //tryb osemkowy - oktalny
        System.out.println(077);                    //oktalny

        System.out.println("znak:\u1887");        //unicode character

        // Czy napis zawiera znak?
        System.out.println("Seks od 18 lat".contains("Seks"));
        System.out.println(t1.contains("wsiur"));
    }
}
