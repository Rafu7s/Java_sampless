package Zadania;

public class zad10 {

    public static void main(String[] args) {

        //For

        // Wypisz cyfry od 1 do 10 włącznie.                     //1-10 pionowo
        for (int x = 1; x <= 10; x++) {
            System.out.println(x + " ");
        }
        System.out.println();                                   //1-10 poziomo
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();                                   //przerwa
        System.out.println();
        // Wypisz cyfry od 10 do 1 włącznie.                       //10-1
        for (int x = 10; x >= 1; x--) {
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println();
        // Wypisz cyfry parzyste nie korzystając z if;a.
        for (int x = 0; x < 10; x += 2) {
            System.out.print(x + " ");
        }
        System.out.println();
        for (int x = 0; x < 10; x++) {
            System.out.print(x * 2 + " ");
        }

        // Wydrukuj trójkąt prostokątny złożony z X’ów.
         /*
         X
        * XX
        * XXX
        * XXXX
        * ......
        * */
        System.out.println();
        System.out.println();
        int x = 5;
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("X");
            }
            System.out.println();
        }
        System.out.println();

        // Stwórz trójkąt prostokątny złożony z X’ów przypisany do zmiennej typu String.
        String trojkat = "";
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                trojkat += "X";
            }
            trojkat += "\n";
        }
        System.out.println(trojkat);

        String trojkat2 = "";
        for (int i = x; i >=1; i--) {                   //x = 5 jak wyzej
            for (int j = 1; j <= i; j++) {
                trojkat2 += "X";                    //trojkat = trojkat + x
            }
            trojkat2 += "\n";
        }
System.out.println(trojkat2);
    }
}



