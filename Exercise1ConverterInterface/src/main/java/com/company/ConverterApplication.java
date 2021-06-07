package com.company;

public class ConverterApplication {

    public static void main(String[] args) {


        ConverterIf converterIf = new ConverterIf();
        System.out.println("The result should give an Error Message: " + converterIf.convertMonth(15));
        System.out.println("The result should give a Month:" + converterIf.convertMonth(5));
        System.out.println("The result should give an Error Message: " + converterIf.convertMonth(-5));

        System.out.println("The result should give an Error Message: " + converterIf.convertDay(15));
        System.out.println("The result should give a Day:" + converterIf.convertDay(5));
        System.out.println("The result should give an Error Message: " + converterIf.convertDay(-5));

        ConverterSwitch converterSwitch = new ConverterSwitch();

        System.out.println("The result should give an Error Message: " + converterSwitch.convertMonth(15));
        System.out.println("The result should give a Month:" + converterSwitch.convertMonth(5));
        System.out.println("The result should give an Error Message: " +converterSwitch.convertMonth(-5));

        System.out.println("The result should give an Error Message: " + converterSwitch.convertDay(15));
        System.out.println("The result should give a Day:" + converterSwitch.convertDay(5));
        System.out.println("The result should give an Error Message: " + converterSwitch.convertDay(-5));

    }

}
