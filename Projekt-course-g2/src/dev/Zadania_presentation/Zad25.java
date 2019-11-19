package dev.Zadania_presentation;

public class Zad25 {      //Interfejsy
    public static void main(String[] args) {
    Runner r = new Sportsman();
    r.run(2);
    }
}
//1) Stwórz interface Runner
//- Dodaj metodę run(m)
interface Runner {
    void run(int m);
}
//2) Stwórz interface Thrower
//- Z metodą throwSth()
interface Thrower {
    void throwSth();
}
//3) Stwórz interface MarathonRunner
//- Dodaj metodę run(m)
interface MarathonRunner {
    void run(int m);
}
//- Stwórz klasę SportsMan która implementuje Runnera
//- Niech klasa SportsMan również implementuje MarthonRunner
//- Niech klasa SportsMan również implementuje Thrower
class Sportsman implements Runner, MarathonRunner, Thrower {
    @Override
    public void run(int m) {
    }
    @Override
    public void throwSth() {

    }
}