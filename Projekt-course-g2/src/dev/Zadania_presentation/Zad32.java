package dev.Zadania_presentation;

public class Zad32 {                      //Wyjątki
    public static void main(String[] args) {
        Zad32 obj = new Zad32();
        try {
            obj.foo();
        } catch (MojWyjatek e) {
            System.out.println(e.a);
        } catch (MyException2 e) {
            System.out.println(e);
        }
        try {
            obj.foo();
            //7) Użyj | do łapania wyjątków
        } catch (MojWyjatek|MyException2 e) {
        }
        try {
            obj.foo2();
        } catch (Exception e) {
        }
//6) Nadpisz funkcję która rzuca wyjątek.
        Zad32 o = new OZad32();
        try {
            o.foo();
        } catch (Exception e) {
            System.out.println(e);
            //8) Uruchom kod w klauzuli finally.
        } finally {
            System.out.println("Finally");
        }
    }
    //4) Stwórz funkcję która rzuca różne wyjątki.
    //5) Stwórz funkcję która rzuca wyjątki mające wspólnego “przodka”.
    void foo() throws MojWyjatek, MyException2 {
        MojWyjatek m2 = new MojWyjatek(10);
        MojWyjatek m1 = new MojWyjatek(20);
        throw m2;
    }
    void foo2() throws Exception {
        MojWyjatek m2 = new MojWyjatek(10);
        MojWyjatek m1 = new MojWyjatek(20);
        throw  m2;
    }
}
//3) Wyrzuć i złap swoje wyjątki.
class OZad32 extends Zad32 {
    void foo() throws MyExcepetion2B {
        System.out.println("OZad32");
        throw new MyExcepetion2B();
    }
}
//1) Stwórz własną klasę która rozszerz RuntimeException.
    class MyExcepetion2B extends MyException2 {
    }
    class MyException2 extends Exception {
    }
    //2) Stwórz własną klasę która rozszerza Exception.
    class MojWyjatek extends Exception {
        final int a;
        MojWyjatek(int a) {this.a = a;}
    }
