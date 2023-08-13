package dev.Zadania_presentation;

import java.util.ArrayList;

public class Zad33 {                //Własna klasa Generyczna
    public static void main(String[] args) {
    MyPair<Integer, String> pair = new MyPair<>(10, "String");
    }
}

//- Stwórz klasę generyczna MyWrapper z polem value o typie generycznym
class MyWrapper<T> {
    T value;
}

//- Stwórz klasę generyczną MyPair z polem a, b o dwóch rożnych typach
//generycznych.

class MyPair<T1, T2> {
    T1 a;
    T2 b;
    MyPair(T1 t1, T2 t2) {
    this.a = t1;
    this.b = t2;
    }
}