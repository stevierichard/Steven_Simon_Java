package com.company;

public class App {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println("The result 1+1 is: " + calc.add(1,1));
        System.out.println("The result of 23-52 is: " + calc.subtract(23,52));
        System.out.println("The result of 34*2 is: " + calc.multiply(34,2));
        System.out.println("The result of 12/3 is: " + calc.divide(12,3));
        System.out.println("The result of 12/7 is: " + calc.divide(12,7));
        System.out.println("The result of 3.4+2.3 is: " + calc.addDouble(3.4,2.3));
        System.out.println("The result of 6.7*4.4 is: " + calc.multiplyDouble(6.7,4.4));
        System.out.println("The result of 5.5-0.5 is: " + calc.subtractDouble(5.5,0.5));
        System.out.println("The result of 10.8/2.2 is: " + calc.divideDouble(10.8,2.2));


    }
}