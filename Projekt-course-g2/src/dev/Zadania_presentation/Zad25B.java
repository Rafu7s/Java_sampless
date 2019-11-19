package dev.Zadania_presentation;

public class Zad25B {
    public static void main(String[] args) {
//4) Przypisz ProPlayera do zmiennej typu Footballer.
    Footballer f = new ProPlayer();
    f.kickBall();

    play(new AmateurPlayer());
    play(new ProPlayer());
    }
    static void play(Footballer footballer) {footballer.kickBall(); }
}

//1) Stwórz interface Footballer
//- dodaj metodę kickBall() ze słowem default i i własna implementacja.
interface Footballer {
    default void kickBall() {System.out.println("KickBall");}
}

//2) Stwórz klasę AmateurPlayer która implementuje Footballer.
class AmateurPlayer implements Footballer {
}

//3) Stwórz klasę ProPlayer która implementuje Footballer i nadpisuje metodę.
class ProPlayer implements Footballer {
    @Override
    public void kickBall() {System.out.println("ProPlayer.kickBall"); }
}