package dev.Zadania_presentation;

public class zad4 {
    public static void main(String[] args) {
        //1 Wypróbuj wszystkie operatory matematyczne.
        System.out.println(9 / 2);
        System.out.println(10 * 2);
        System.out.println(5.0 / 2);
        System.out.println(5 % 2);
        System.out.println(20 % 3);  //[2]
        System.out.println(10 % 3);  //[1]
        System.out.println(5 / 2.0);

        int x = 5;
        System.out.println(x % 2 == 0); //[false]

        //2 Wypróbuj wszystkie operatory bitowe. (& | ! ^ >> <<)
        System.out.println(10 & 2);
        System.out.println(10 | 2);
        System.out.println(10 != 2);
        System.out.println(10 == 2);
        System.out.println(10 ^ 2);
        System.out.println(10 >> 2);  //[2]  1010>0010

        int i7 = 7; //111
        int i6 = 6; //110
        System.out.println(i7 & i6); //110 [6]
         /* 111
            110
            110 [6] */

        System.out.println(i7 ^ i6); //001 [1]
         /* 111
            110
            001 */

        System.out.println(15 ^ 6); //[9]
        //101
        //110

        /* 1111
            110
           1001 [9] */

        System.out.println(5 | 2); //[7]
        // 101
        //  10
        // 111

        //3 Wypróbuj operator modulo(%-reszta z dzielenia) dla ujemnych argumentów.
        System.out.println(20 % -3);  //[2]
        System.out.println(-20 % 3);  //[-2]

        //4 Wypróbuj operator modulo dla typów zmienno przecinkowych.
        System.out.println(3.5 % 3.2);
        System.out.println(5.5 % 1.1);
        System.out.println(5.5 % 2);  //[1,5]

        //5 Oblicz wybraną wartość geometryczna korzystając ze znanego Ci wzoru.
        int a = 3;
        int b = 4;
        System.out.println(Math.sqrt(a*a + b*b));   //[5]
        //pierwiastek kwadratowy z 9+16=25   5*5=25

        //6 Sprawdź zachowanie zmiennej final oraz operatora ++.
        System.out.println(x++);
        System.out.println(x++);
        System.out.println(x);

        final int X = 125;
        }
}
