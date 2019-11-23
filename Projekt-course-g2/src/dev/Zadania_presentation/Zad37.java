package dev.Zadania_presentation;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Zad37 {                //Map
    public static void main(String[] args) {
        //1) Stwórz TreeMapę z użyciem klasy anonimowej “Comparator”,
        //2) Stwórz TreeMapę dla klasy(klucz) która rozszerza interface Comparable,
        //3) Stwórz TreeMapę dla klasy(klucz) która nie rozszerza interface Comparable,
        //4) Stwórz HashMapę dla klasy(klucz) które nie nadpisuje hashcode oraz equals,
        //5) Stwórz HashMapę dla klasy(klucz) która nadpisuje hashcode oraz equals.
        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        };
        Map<String, String> map = new TreeMap<>(stringComparator);

        map.put("dwa", "xyz1");
        map.put("DWA", "xyz2");
        map.put("abcd", "xyz23");
        System.out.println(map);
    }
}