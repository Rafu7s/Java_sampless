package Zadania;

public class zad13 {            //Wrappery

    public static void main(String[] args) {
        //Stwórz obiekty różnych klas korzystając z new oraz .valueOf.
        Integer i1 = new Integer(1);
        Integer i2 = Integer.valueOf(1);
        Integer i3 = Integer.valueOf(1);

        //użyj metody .equals do porównania obiektów reprezentujących tą samą        wartość.
        System.out.println(i1.equals(i2));

        System.out.println("----------");
        //Porównaj używając ==
        System.out.println(i1 == i2);
        System.out.println(i2 == i3);
        System.out.println(i1 == 1);
        System.out.println(i2 == 1);

        System.out.println("----------");
        //Porównaj obiekt z prymitywem korzystając metody .equals.
        System.out.println(i1.equals(1));
        System.out.println(i2.equals(1));

        System.out.println("----------");
        //Przypisz Int to Integer oraz Integer do Int.
        int imaly = i1;
        System.out.println(imaly);

        Integer iduzy = imaly;
        System.out.println(iduzy);

        System.out.println(iduzy.compareTo(4));
    }
    boolean foo(Long l1, Long l2) {return l1.equals(l2); }
}