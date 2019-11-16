package dev.Zadania_presentation;

public class Zad16 {     //METODY
    public static void main(String[] args) {
        BottleV2 b = new BottleV2();
        System.out.println(b.isEmpty());
        b.currentLevel = 10;
        int x = 3;
        b.drink(x);
        System.out.println(b.currentLevel);
        b.makeEmpty();
        System.out.println(b.currentLevel);
    }
}

class BottleV2 {
    int capacity;
    int currentLevel;
    //Do klasy Bottle dodaj metodę isEmpty która zwraca boolean currentLevel == 0.
    boolean isEmpty() {return currentLevel == 0;}
    //- Do klasy Bottle dodaj metodę makeEmpty która nie zwraca nic natomiast
    //ustawia currentLevel na 0.
    void makeEmpty() {currentLevel = 0;}
    //- Do klasy Bottle dodaj metodę drink która nie zwraca nic natomiast przyjmuje
    //jeden argument volume i odejmuje od tą wartość od pola currentLevel.
    void drink(int volume) { currentLevel -= volume;};
}