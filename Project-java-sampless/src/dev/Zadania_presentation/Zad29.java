package dev.Zadania_presentation;

import java.util.Arrays;

public class Zad29 {             //Klasy anonimowe
    public static void main(String[] args) {
        //- W metodzie main Stwórz instancje Song przy pomocy klasy anonimowej i
        //uruchom play.
        Song s = new Song() {
            @Override
            public void play() {System.out.println("uruchomione"); }
        };
        s.play();
        foo(1, new int[]{2, 3});
    }
    static void foo(int x, int... args) {System.out.println(Arrays.toString(args));}
}

//- Stwórz interface Song, z metodą void play()
interface Song {
    void play();
}