package dev.Zadania_presentation;

public class Zad17 {                //KONSTRUKTOR
    public static void main(String[] args) {
     //Dodaj konstruktor domyślny który wywołał ten pierwszy z argumentem 10.
    int initialCapacity = 10;
    BottleV3 b = new BottleV3(initialCapacity);

    System.out.println(b.isEmpty());
    b.currentLevel = 10;
    int x = 3;
    b.drink(x);
    System.out.println(b.currentLevel);
    b.makeEmpty();
    System.out.println(b.currentLevel);
    }
}

class BottleV3 {
    //Spróbujmy dodać final do pól tej klasy.
    //Zmień pole capacity na final.
    final int capacity;
    int currentLevel;

    //W klasie Bottle dodajmy konstruktor który przyjmuje capacity jako argument.
    public  BottleV3(int capacity, int currentLevel) {
        this.capacity = capacity;
        this.currentLevel = currentLevel;
    }
    //Dodaj konstruktor dwu argumentowy
    public BottleV3(int capacityAndCurrentLevel) {
        this(capacityAndCurrentLevel, capacityAndCurrentLevel);
    }
    public BottleV3() {this(20); }

    boolean isEmpty() {
        return currentLevel == 0;
    }

    void makeEmpty() {
        currentLevel = 0;
    }

    void drink(int volume) {
        currentLevel -= volume;
    }
}