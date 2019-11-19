package dev.Zadania_presentation;

public class Zad22 {
    public static void main(String[] args) {
        Phone p = new Phone("123");
        MobilePhone m = new MobilePhone("4123");

        p.call(m);
        m.call(p);
    }
}
//1) Stwórz klasę Phone
//a) Dodaj metodę call(Phone other)
class Phone {
    public void call(Phone other) {
        System.out.println("Phone.Call  " + this.number + " => " + other.number);
    }
        final String number;
        Phone(String number) {this.number = number; }
    }
//2) Stwórz klasę MobilePhone
//a) dodaj metodę call(Phone other) w które wykonasz metodę call(Phone other) z klasy Phone.
class MobilePhone extends  Phone {
    MobilePhone(String number) {super(number); }

    @Override
    public void call(Phone other) {
        System.out.println("MobilePhone.call");
        super.call(other);
    }
    //3) Do klasy MobilePhone dodaj metodę sms(Phone other, String text)
    //4) Sprawdź czy dla zmiennej phone możesz wysłać sms gdy obiekt jest typu
    //MobilePhone
    public void sms(Phone other) {
        if (other instanceof MobilePhone) {
            System.out.println("SMS" + this.number + "=>" + other.number);
        }
    }
}