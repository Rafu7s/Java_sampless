package dev.Zadania_presentation;

public class Zad30 {             //Tablica jako argument metody
    public static void main(String[] args) {
        //- W metodzie main uruchom bar na dwa sposoby
        //- W metodzie main uruchom foo
        TestTablic.bar(new int[]{1, 2, 3});
        TestTablic.bar(1, 2, 3);
        TestTablic.foo(new int[]{1, 2, 3});
    }
}
//- Stwórz klasę TestTablic
//- dodaj metodę statyczną foo która przyjmuje tablice (przy pomocy [])
//- Dodaj jakis printLine z informacja
//- dodaj metodę statyczną bar która przyjmuje tablice (przy pomocy ...)
//- Dodaj jakis printLine z informacja
    class TestTablic {       //mozna bez niej i dodac to do main wtedy bez TestTablic. bedzie
    static void foo(int[] arg) {System.out.println("foo"); }
    static void bar(int... arg) {System.out.println("bar"); }
}