package dev.Zadania_presentation;

public class Zad24 {     //Konstruktor a dziedziczenie
    public static void main(String[] args) {

    }
}
//1) Stwórz klasę Osoba z jednym konstruktorem przyjmującym imię oraz
//nazwisko jako argumenty konstruktora.
class Osoba {
    public Osoba(String imie) { this.imie = imie; }

    String imie;
}
//2) Stwórz klasę Uczeń która rozszerza klasę Osoba, spraw, żeby klasa się
//komplikowała uwzględniając wiedzę z poprzedniego slajdu.
class Uczen extends Osoba {
    public Uczen(String imie) { super(imie); }
}

