package dev.Zadania_presentation;

public class Zad27 {     //Enum
    public static void main(String[] args) {
        System.out.println(Planety.Ziemia);
        System.out.println(Planety.Ziemia.size);
        System.out.println(Planety.Jowisz);
    }
}
//1) Stwórz własny enum Planet
//2) Dodaj 3 wyliczenia enuma Planet.
//3) Dodaj pole size
enum Planety {
    Ziemia(20), Jowisz(30) {
        @Override
        public String toString() {
            return super.toString();
        }
    }, Mercury(20) {
        @Override
        public String toString() {
            return super.toString();
        }
    };

    public final int size;

    //4) Dodaj konstruktor do enuma i ustaw różne wartości dla różnych Planet.
    Planety (int size) {
    this.size = size;
    //this.name()
    }

    @Override
    public String toString() {
        return this.name() + " " + this.size;
    }
}

