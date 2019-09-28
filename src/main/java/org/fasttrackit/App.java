package org.fasttrackit;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }


    Summary summary = new Summary(3.2, 5.6);
    {
        double sum = summary.getNumber3() + summary.getNumber4();
        System.out.println(summary.getNumber3() + "+" + summary.getNumber4() + "=" + sum);
    }

    Substraction subtraction = new Substraction(5.6, 6.3);
    {
        double sub = subtraction.getNumber1() - subtraction.getNumber2();
        System.out.println(subtraction.getNumber1() + "-" + subtraction.getNumber2() + "=" + sub);
    }

    Multiplication multiplication = new Multiplication(5.6, 9.6);

    {
        double multi = multiplication.getNumber5() * multiplication.getNumber6();
        System.out.println(multiplication.getNumber5() + "*" + multiplication.getNumber6() + "=" + multi);
    }
}

