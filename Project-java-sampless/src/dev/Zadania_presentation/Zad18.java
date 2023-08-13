package dev.Zadania_presentation;

import org.w3c.dom.css.Rect;

public class Zad18 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 9);
        System.out.println(r1.a + " " + r1.b);

        Rectangle r2 = new Rectangle(10);
        System.out.println(r2.a + " " + r2.b);
    }
}
//2. Zmodyfikuj konstruktor jednoargumentowy i wewnątrz tego konstruktora wykonaj konstruktor
//dwuargumentowy.
//1. Stwórz klasę Rectangle
class Rectangle {
    //- Klasa ta powinna mieć dwa pola liczbowe final odpowiadające bokom prostokąta
    final int a;
    final int b;

    //Inicjalizacja tych pól powinna nastąpić w konstruktorze
    Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }
    //- Klasa powinna mieć dwa konstruktory:
    //- Przyjmuje dwa argumenty liczbowe
    //- Przyjmuje jeden argument liczbowy, co oznacza że dany obiekt posiada dwa boki równe
    Rectangle(int a) {this(a, 5); }
}