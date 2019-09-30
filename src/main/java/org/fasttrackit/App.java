package org.fasttrackit;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }


    Summary summary = new Summary();

    {
        System.out.println( summary.number3() + "+" + summary.number4() + "=" + summary.sum());
    }

    Substraction subtraction = new Substraction();

    {
        System.out.println(subtraction.number1() + "-" + subtraction.number2() + "=" + subtraction.sub());
    }

    Multiplication multiplication = new Multiplication();

    {
        System.out.println(multiplication.number5() + "*" + multiplication.number6() + "=" + multiplication.multi());
    }

}

