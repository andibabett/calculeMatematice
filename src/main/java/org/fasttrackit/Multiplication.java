package org.fasttrackit;

public class Multiplication {
    private double number5;
    private double number6;

    public Multiplication(double number5, double number6) {
        this.number5 = number5;
        this.number6 = number6;
    }

    public void multi(double number5, double number6) {
        double multi = number5 * number6;
        System.out.println(number5 + "*" + number6 + "=" + multi);
    }

    {
        double multi = number6 * number5;
        System.out.println(number6 + "*" + number5 + "=" + multi);
    }

    public double getNumber5() {
        return number5;
    }

    public void setNumber5(double number5) {
        this.number5 = number5;
    }

    public double getNumber6() {
        return number6;
    }

    public void setNumber6(double number6) {
        this.number6 = number6;
    }

}
