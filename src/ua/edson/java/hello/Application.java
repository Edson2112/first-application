package ua.edson.java.hello;

import java.util.Scanner;

public class Application {


    public static void main(String[] args) {

        // System.out.println("Hello!!!");

//        Scanner in = new Scanner(System.in);
//
//        Integer a = in.nextInt();
//        Integer b = in.nextInt();
//
//        System.out.println(a + b);

        Scanner in = new Scanner(System.in);

        Integer a = in.nextInt();
        //Integer b = vozrast.nextInt();

        if (a < 10) {
            System.out.println("Ребёнок");
        } else if (a <= 17) {
            System.out.println("Парень");
        } else if (a < 50) {
            System.out.println("Мужик");
        } else if (a < 100) {
            System.out.println("Дед");
        } else {
            System.out.println("Cупер Древний");
        }
    }
}
