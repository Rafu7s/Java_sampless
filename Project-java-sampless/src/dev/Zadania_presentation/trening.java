package dev.Zadania_presentation;

public class trening {
    public static void main(String[] args) {

        PETLA_X:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 5) {
                    break PETLA_X;
                }
            }
        }

        int wynik = 1;
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (j != 5) {
                    System.out.print(i + " " +j);
                }
            }
        }

        System.out.println("--------");
        System.out.println("Jaki dowolny tekst");
        int[] toCharArray = {100, 200};

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (j != 5) {
                    System.out.println(i + " " +j);
                }
            }
        }
    }
}
