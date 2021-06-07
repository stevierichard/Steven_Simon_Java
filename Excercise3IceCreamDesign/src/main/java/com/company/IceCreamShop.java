package com.company;

import java.util.Scanner;

public class IceCreamShop {
    private String flavor;
    private String size;
    private int quantity;
    private int price;

    public String iceCream() {
        flavor = getFlavor();
        size = getSize();
        quantity = getQuantity();
        price = getPrice();
        return "Your flavor is: " + flavor + ", The size is: " + size + ", Quantity is: " + quantity + ", Your Price is: " + price;

    }

        Scanner scanner = new Scanner(System.in);
    public String getFlavor() {
        System.out.println("Enter your flavor eg vanilla, cinnamon, peach, chocolate etc");
        String flavor = scanner.nextLine();
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

       public String getSize() {
        System.out.println("Select your size eg Small, Medium, Large");
        String size = scanner.nextLine();
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getQuantity() {
        System.out.println("Enter your quantity eg 1, 2, 4");
        int quantity = Integer.parseInt(scanner.nextLine());
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        int price = 5 * quantity;
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
