package org.fasttrackit;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }


    Summary summary = new Summary(5.6, 5.9);

    double sum = summary.getNumber3() + summary.getNumber4();

    {
        System.out.println(summary.getNumber3() + "+" + summary.getNumber4() + "=" + sum);
    }

    Substraction subtraction = new Substraction(9.3, 5.6);

    double sub = subtraction.getNumber1() - subtraction.getNumber2();

    {
        System.out.println(subtraction.getNumber1() + "-" + subtraction.getNumber2() + "=" + sub);
    }

    Multiplication multiplication = new Multiplication(5.6, 9.6);

    {
        double multi = multiplication.getNumber5() * multiplication.getNumber6();
        System.out.println(multiplication.getNumber5() + "*" + multiplication.getNumber6() + "=" + multi);
    }
}