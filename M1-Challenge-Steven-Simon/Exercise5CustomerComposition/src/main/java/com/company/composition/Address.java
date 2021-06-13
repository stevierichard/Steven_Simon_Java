package com.company.composition;

import java.util.Objects;

public class Address {
    private String billingStreet1;
    private String billingStreet2;
    private String billingCity;
    private String billingState;
    private String billingZip;

    private String shippingStreet1;
    private String shippingStreet2;
    private String shippingCity;
    private String shippingState;
    private String shippingZip;


    public Address(String billingStreet1, String billingStreet2, String billingCity, String billingState, String billingZip, String shippingStreet1, String shippingStreet2, String shippingCity, String shippingState, String shippingZip) {
        this.billingStreet1 = billingStreet1;
        this.billingStreet2 = billingStreet2;
        this.billingCity = billingCity;
        this.billingState = billingState;
        this.billingZip = billingZip;
        this.shippingStreet1 = shippingStreet1;
        this.shippingStreet2 = shippingStreet2;
        this.shippingCity = shippingCity;
        this.shippingState = shippingState;
        this.shippingZip = shippingZip;


        System.out.println("Billing Street1: " + billingStreet1);
        System.out.println("Billing Street2: " + billingStreet2);
        System.out.println("City: " + billingCity);
        System.out.println("State: " + billingState);
        System.out.println("Zip: " + billingZip);


        System.out.println("Shipping Street1: " + shippingStreet1);
        System.out.println("Shipping Street2: " + shippingStreet2);
        System.out.println("City: " + shippingCity);
        System.out.println("State: " + shippingState);
        System.out.println("Zip: " + shippingZip);
    }

    public String getBillingStreet1() {
        return billingStreet1;
    }

    public void setBillingStreet1(String billingStreet1) {
        this.billingStreet1 = billingStreet1;
    }

    public String getBillingStreet2() {
        return billingStreet2;
    }

    public void setBillingStreet2(String billingStreet2) {
        this.billingStreet2 = billingStreet2;
    }

    public String getBillingCity() {
        return billingCity;
    }

    public void setBillingCity(String billingCity) {
        this.billingCity = billingCity;
    }

    public String getBillingState() {
        return billingState;
    }

    public void setBillingState(String billingState) {
        this.billingState = billingState;
    }

    public String getBillingZip() {
        return billingZip;
    }

    public void setBillingZip(String billingZip) {
        this.billingZip = billingZip;
    }

    public String getShippingStreet1() {
        return shippingStreet1;
    }

    public void setShippingStreet1(String shippingStreet1) {
        this.shippingStreet1 = shippingStreet1;
    }

    public String getShippingStreet2() {
        return shippingStreet2;
    }

    public void setShippingStreet2(String shippingStreet2) {
        this.shippingStreet2 = shippingStreet2;
    }

    public String getShippingCity() {
        return shippingCity;
    }

    public void setShippingCity(String shippingCity) {
        this.shippingCity = shippingCity;
    }

    public String getShippingState() {
        return shippingState;
    }

    public void setShippingState(String shippingState) {
        this.shippingState = shippingState;
    }

    public String getShippingZip() {
        return shippingZip;
    }

    public void setShippingZip(String shippingZip) {
        this.shippingZip = shippingZip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(billingStreet1, address.billingStreet1) && Objects.equals(billingStreet2, address.billingStreet2) && Objects.equals(billingCity, address.billingCity) && Objects.equals(billingState, address.billingState) && Objects.equals(billingZip, address.billingZip) && Objects.equals(shippingStreet1, address.shippingStreet1) && Objects.equals(shippingStreet2, address.shippingStreet2) && Objects.equals(shippingCity, address.shippingCity) && Objects.equals(shippingState, address.shippingState) && Objects.equals(shippingZip, address.shippingZip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(billingStreet1, billingStreet2, billingCity, billingState, billingZip, shippingStreet1, shippingStreet2, shippingCity, shippingState, shippingZip);
    }

    @Override
    public String toString() {
        return "Address{" +
                "billingStreet1='" + billingStreet1 + '\'' +
                ", billingStreet2='" + billingStreet2 + '\'' +
                ", billingCity='" + billingCity + '\'' +
                ", billingState='" + billingState + '\'' +
                ", billingZip='" + billingZip + '\'' +
                ", shippingStreet1='" + shippingStreet1 + '\'' +
                ", shippingStreet2='" + shippingStreet2 + '\'' +
                ", shippingCity='" + shippingCity + '\'' +
                ", shippingState='" + shippingState + '\'' +
                ", shippingZip='" + shippingZip + '\'' +
                '}';
    }
}
