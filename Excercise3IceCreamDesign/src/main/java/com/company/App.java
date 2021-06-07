package com.company;

public class App {

    public static void main(String[] args) {
        IceCreamShop iceCreamShop = new IceCreamShop();
        System.out.println(iceCreamShop.iceCream());

        IceCreamFactory iceCreamFactory = new IceCreamFactory();
        System.out.println(iceCreamFactory.Factory());
    }
}
