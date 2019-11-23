package dev.Zadania_presentation;

import java.util.LinkedList;
import java.util.Queue;

public class Zad37B {
    public static void main(String[] args) {
        /* 1) Stwórz dowolną Queue i dodaj 3 elementy następnie pobierz
        a) Sprawdź metody które nie rzucają wyjątków
        b) Sprawdź metody które rzucają wyjątki
        2) Stwórz dowolną Dequeue i dodaj 3 elementy następnie pobierz
        a) Sprawdź metody które nie rzucają wyjątków
        b) Sprawdź metody które rzucają wyjątki
         */
        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        queue.add(2);
        System.out.println(queue);

        System.out.println(queue.poll());
        System.out.println(queue);

        System.out.println(queue.poll());
        System.out.println(queue);

        System.out.println(queue.poll());
        System.out.println(queue.remove());
    }
}
