package com.company;

import java.util.Scanner;

public class IceCreamFactory {

    private String ingredients;
    private String flavor;
    private int ageMix;
    private int freeze;

    public String Factory(){
        ingredients = getIngredients();
        flavor = getFlavor();
        ageMix = getAgeMix();
        freeze = getFreeze();
        return "Your blending is: " + ingredients + ", The Flavor is: " + flavor + ", Age mix is: " + ageMix + ", Your Freezing point is: " + freeze;

    }

    Scanner scanner = new Scanner(System.in);
    public String getIngredients() {
        System.out.println("Enter your ingredients eg fat source, nonfat, stabilizers etc");
        String blending = scanner.nextLine();
        return blending;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getFlavor() {
        System.out.println("Enter your flavor eg vanilla, cinnamon, peach, chocolate etc");
        String flavor = scanner.nextLine();
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public int getAgeMix() {
        System.out.println("Ice cream aged eg for 4hrs etc");
        int ageMix = Integer.parseInt(scanner.nextLine());
        return ageMix;
    }

    public void setAgeMix(int ageMix) {
        this.ageMix = ageMix;
    }

    public int getFreeze() {
        System.out.println("Enter freezing point eg -30, -20, -15");
        int freeze = Integer.parseInt(scanner.nextLine());
        return freeze;
    }

    public void setFreeze(int freeze) {
        freeze = freeze;
    }
}
