package dev.Zadania_presentation;

public class Zad28 {    //Enum a metody
    public static void main(String[] args) {
    System.out.println(Planety2.Y.isCloserToSunThanEarth());
    System.out.println(Planety2.X.isCloserToSunThanEarth());
    System.out.println(Planety2.Z.isCloserToSunThanEarth());
    }
}
//1) Dodaj dla enuma Planet metodę isCloserToSunThanEarth()
//a) Domyślnie zwróć false.
//b) Dla planet bliżej słońca niż ziemia zwróć true.
enum Planety2 {
    X, Y {
        @Override
        boolean isCloserToSunThanEarth() {
            return true;
        }
    }, Z;

    boolean isCloserToSunThanEarth() {return false;}
}