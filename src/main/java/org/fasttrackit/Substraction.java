package org.fasttrackit;

public class Substraction {
    private double number1;
    private double number2;

    public Substraction(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public void sub(double number2, double number1) {
        double sub = number1 - number2;
        System.out.println(number1 + "-" + number2 + "=" + sub);
    }
    {
        double sub = number2 - number1;
        System.out.println( number2 + "-" + number1 + "=" + sub);
    }


    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    @Override
    public String toString() {
        return "Substraction{" +
                "number1=" + number1 +
                ", number2=" + number2 +
                '}';
    }
}