package dev.Zadania_presentation;

public class Zad20 {
    public static void main(String[] args) {
        int initialCapacity = 10;
        BottleV4 b1 = new BottleV4(initialCapacity);
        BottleV4 b2 = new BottleV4(initialCapacity);

        System.out.println(b1.equals("napis"));
        System.out.println(b1.equals(b2));
        System.out.println(b1.hashCode());
    }
}

class BottleV4 {
        final int capacity;
        int currentLevel;
    //1) W klasie bottle nadpisz metodę toString().
@Override
    public String toString() {return this.currentLevel + "/" + this.capacity; }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof BottleV4) {
            BottleV4 other = (BottleV4)obj;
            return this.capacity == other.capacity;
        } else {
            return false;
        }
    }
    //2) W klasie bottle nadpisz hashCode i equals.
    @Override
    public int hashCode() {
        return this.currentLevel;
    }

    public BottleV4(int capacity, int currentLevel) {
        this.capacity = capacity;
        this.currentLevel = currentLevel;
    }
    public BottleV4(int capacityAndCurrentLevel) {this(capacityAndCurrentLevel, capacityAndCurrentLevel);
    }

    public BottleV4() {
        this(20);
    }

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