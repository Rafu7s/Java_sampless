 package dev.Zadania_presentation;

public class zad12 {
    public static void main(String[] args) {
        //Break & Continue

        //Przerwij nieskończoną pętle używając break.
        Petla1:
        for (int i = 1; ; i++) {
            if (i % 127 == 0) {
                break;
            }
            System.out.println(i);
        }

        //Stwórz zagnieżdżone pętle. I przerwij wykonanie pętli zewnętrznej.
        System.out.println();
        Petla2:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(i + " " + j);
                if (i + j == 15) {
                    System.out.println("break");
                    break Petla2;
                }
            }
        }

            //Stwórz zagnieżdżone pętle. I przerwij wykonanie bloku zewnętrznego.
            Petla2:
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    System.out.println(i + " " + j);
                    if (i + j == 15) {
                        System.out.println("continue");
                        continue Petla2;
                    }
                }
            }
            System.out.println();
            //dodatkowa
            PETLA_B:
            for (int i = 1; i < 20; i++) {
                for (int j = 1; j < 10; j++) {
                    System.out.println(i + " " + j);
                    if (j != 19) {
                        System.out.println("Stop");
                        //break PETLA_B;
                    }
                }
            }


        }
    }
