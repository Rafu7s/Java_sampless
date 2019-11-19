package dev.Zadania_presentation;

public class Zad21 {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.engineStart();

        System.out.println(car instanceof Vehicle);
        System.out.println(car instanceof Car);

        Vehicle vehicle = new Vehicle();
        System.out.println(vehicle instanceof Car);
    }
}
//1) Stwórz klasę Vehicle z metodami
//a) publiczna metodą engineStart(),
//b) metodą protected lightWarningLight().
//c) metodą prywatną supplyFuel().
class Vehicle {
    public void engineStart() {System.out.println("Vehicle.startEngine"); }
    protected void ligntWarningLight() {System.out.println("Vehicle.light.WarningLight"); }
    private void  supplyFuel() {System.out.println("Vehicle.supplyFuel"); }
}

//2) Stwórz klasę Car rozszerzającą Vehicle
//a) nadpisz metodę engineStart().
//       b) nadpisz metodę lightWarningLight().
//       d) Dodaj final do metod z klasy Vehicle.
//e) Usuń słowa final z klasy Vehicle.
//       f) Dla metody engineStart z klasy Car ustaw modyfikator dostępu na protected.

class Car extends Vehicle {
    public void newMethod() {System.out.println("newMethod"); }

    @Override
    public void engineStart() {
        System.out.println("Car.engineStart");
        super.engineStart();
    }
    @Override
    public void ligntWarningLight() {System.out.println("Car.lightWarningLight"); }
    //      c) Spróbuj wykonać / nadpisać metodę supplyFuel().
   //@Override
    private void supplyFuel() {System.out.println("Car.supplyFuel"); }
}