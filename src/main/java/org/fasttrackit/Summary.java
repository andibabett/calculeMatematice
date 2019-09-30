package org.fasttrackit;

public class Summary {
     double number3;
     double number4;


    public void sum() {
        double sum = number3 + number4;
        System.out.println(number3 + "+" + number4 + "=" + sum);
    }

    {
        double sum = number4 + number3;
        System.out.println(number4 + "+" + number3 + "=" + sum);
    }
}
