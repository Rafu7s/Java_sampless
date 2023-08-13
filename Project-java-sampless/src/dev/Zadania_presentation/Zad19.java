package dev.Zadania_presentation;

import com.sun.corba.se.spi.orbutil.threadpool.Work;

public class Zad19 {     //POLA I METODY STATYCZNE
    public static void main(String[] args) {
        //- W głównej metodzie programu stwórz 5 workerów. Uruchom dostępne
        //metody, metodę statyczną uruchom na 2 sposoby.
        Worker w1 = new Worker("A");
        Worker w2 = new Worker("B");

        w1.msg1();
        w2.msg1();

        Worker.msg2();
        w1.msg2();
        w1.msg3();
    }
}
//Stwórz klasę Worker i dodaj pole statyczne counter które bedziesz
//inkrementował w momęcie wywoływania konstruktora
class Worker {
    static int counter;
    String name;
    //       - Dodaj niestatyczne pole name (może być przypisywane w konstruktorze).
    //       Spróbuj w ramach metody statycznej odwołać się do tego pola.
    Worker(String name) {
        this.name = name;
        counter++;
    }
    //- Dodaj metodę niestatyczną która będzie wyswietla informacje:
    //- “Razem ze mną pracuje {licznik} ludzi”
void msg1() {System.out.println("Razem ze mną pracuję " + (counter-1)+ " ludzi"); }
    //- Dodaj metodę statyczną która będzie wyświetlała informacje:
    //- “Łącznie jest {licznik} pracowników
static void  msg2() {System.out.println("Lącznie jest " + counter + " pracowników"); }
    //- Dodaj metodę niestatyczną która wywoła stworzoną wcześniej metodę
    //statyczną.
void msg3() {msg2(); }
}
