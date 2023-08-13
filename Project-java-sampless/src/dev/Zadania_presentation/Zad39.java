package dev.Zadania_presentation;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Zad39 {
    public static void main(String[] args) {
        //●UnaryOperator<T> jest specyficznym przypadkiem interfejsu Function. W tym
        //przypadku typ argumentu i typ zwracany są te same.
        //Utwórz instancje podanych interfejsów funkcyjnych, korzystając z lambdy
        //Function<T, R> zawiera metodę apply, która przyjmuje instancję klasy T zwracając
        //instancję klasy R
        Function<String, Integer> l1 = (napis) -> napis.length();
        System.out.println(l1.apply("Hello"));
        //● Consumer<T> zawiera metodę accept, która przyjmuje instancję klasy T,
        Consumer<Integer> l2 = value -> System.out.println(value);
        l2.accept(200);
        //● Predicate<T> zawiera metodę test, która przyjmuje instancję klasy T i zwraca flagę,
        Predicate<Integer> l3 = value -> value % 3 == 0;
        System.out.println(l3.test(123));
        System.out.println(l3.test(124));

        // obiekt do pobierania wartosci losowych
        Random r = new Random();
        //● Supplier<T> zawiera metodę get, która nie przyjmuje żadnych parametrów i zwraca
        //instancję klasy T
        Supplier<Integer> l4 = () -> r.nextInt();
        System.out.println(l4.get());
        System.out.println(l4.get());
        System.out.println(l4.get());
    }
}
