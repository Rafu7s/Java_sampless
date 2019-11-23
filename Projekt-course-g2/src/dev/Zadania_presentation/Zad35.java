package dev.Zadania_presentation;

import java.util.ArrayList;
import java.util.List;

public class Zad35 {     //Dla ArrayListy, LinkedListy i Vectora
    public static void main(String[] args) {
        //- Stwórz obiekty danych typów
        // - Dodaj 1 oraz więcej elementów
        //- Usuń element z listy n-ty lub konkretny
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);
        Integer Usunieto = list.remove(2);

        System.out.println(list);
        System.out.println(Usunieto);

        try {
            list.remove(2);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        list.remove(Integer.valueOf(5));
        System.out.println(list);
    }
}