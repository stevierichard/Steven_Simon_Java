package com.company.composition;

public class App {

    public static void main(String[] args) {
        CustomerComposition customerComposition = new CustomerComposition("Steve", "Simon","steve@steve.com", "510-514-8600");
//        System.out.println(customerComposition);
        Address billingAndShippingAddress = new Address("Country Club Blvd","","San Francisco","California","94500", "El Camino st", " ", "San Jose","California","93500");
//        System.out.println(billingAndShippingAddress);

    }
}
