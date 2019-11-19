package dev.Zadania_presentation;

public class Zad26 {           //Abstract Class
    public static void main(String[] args) {
        House h = new FlatRoofHouse(10, 12);
        System.out.println(h.cubicCapacity());
    }
}
//- Stwórz klasę abstrakcyjną House
//- Klasa ta powinna mieć metodę abstrakcyjną cubicCapacity, zwracającą Int
abstract class House {
    abstract int cubicCapacity();
}
//- Stwórz klasy rozszerzające CottageHouse oraz FlatRoofHouse.
// - Klasa CottageHouse ma 3 parametry a, l, h
class CottageHouse extends House {
    final int a;
    final int l;
    final int h;

    CottageHouse(int a, int l, int h) {
    this.a = a;
    this.l = l;
    this.h = h;
}
    //- Dla klasy Cottage cubicCapacity to a*a*l + a*a*h*½
    @Override
    int cubicCapacity() {
        return a*a*l + a*a*h/2; }
}
//- Klasa FlatRoofHouse ma 2 parametry a, l
class FlatRoofHouse extends House {
    final int a;
    final int l;

    FlatRoofHouse(int a, int l) {
        this.a = a;
        this.l = l;
    }
    //- Dla klasy FlatRoof cubicCapacity to a*a*l
    @Override
    int cubicCapacity() {
        return a*a*l;
    }
}