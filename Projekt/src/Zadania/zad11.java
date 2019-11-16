package Zadania;

public class zad11 {

    public static void main(String[] args) {
                                    //While
        //Wypisz cyfry od 1 do 10 włącznie
    int y = 1;
    while (y <= 10) {
        System.out.print(y + " ");
        y++;
    }
    //Wypisz cyfry od 10 do 1 włącznie
    System.out.println();
    y = 10;
    while (y >= 1) {
        System.out.print(y +" ");
        y--;
    }
    //Wypisz cyfry parzyste nie korzystając z if;a.
    System.out.println();
    y = 0;
    while (y <= 20) {
        System.out.print(y+ " ");
        y += 2;
    }
    }
}
