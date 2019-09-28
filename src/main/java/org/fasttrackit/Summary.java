package org.fasttrackit;

public class Summary {
    private double number3;
    private double number4;

    public Summary(double number3, double number4) {
        this.number3 = number3;
        this.number4 = number4;
    }

    public void sum(double number3, double number4) {
        double sum = number3 + number4;
        System.out.println(number3 + "+" + number4 + "=" + sum);
    }

    public double getNumber3() {
        return number3;
    }

    public void setNumber3(double number3) {
        this.number3 = number3;
    }

    public double getNumber4() {
        return number4;
    }

    public void setNumber4(double number4) {
        this.number4 = number4;
    }
}
