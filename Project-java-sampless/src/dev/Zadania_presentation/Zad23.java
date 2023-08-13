package dev.Zadania_presentation;

public class Zad23 {     //Overloading
    public static void main(String[] args) {
        Plane p = new Plane();
        p.addPassanger();
        short s = 20;
        p.addPassanger(s);
        byte b = 20;
        p.addPassanger(b);
        System.out.println(p.passangerNumber);
    }
}
//Stwórz klase Plane
//- Dodaj pole passengerNumbers
class  Plane {
    int passangerNumber;

    //- Dodaj metode onboardPassanger()
    //- inkrementuj passengers
    public void addPassanger() { passangerNumber++; }
    //- Dodaj metodę onboardPassanger(int n)
    //- dodaj n pasażerów do passengers
    public void  addPassanger(int n) { passangerNumber+=n; }
    public void addPassanger(short n) { passangerNumber+=n; }
}