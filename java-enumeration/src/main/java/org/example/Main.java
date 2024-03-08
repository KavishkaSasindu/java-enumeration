package org.example;

enum Month{
    JANUARY(1),FEBRUARY(2),MARCH(3),APRIL(4),MAY(5);

    final int number;
    Month(int number){
        this.number = number;
    }
}

public class Main{
    public static void main(String[] args){


        Month month = Month.JANUARY;

        System.out.println(month);
        System.out.println(month.number);
    }


}