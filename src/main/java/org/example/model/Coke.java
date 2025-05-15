package org.example.model;

public class Coke extends ProductForSale{

    private int amount;

    public Coke(String type, double price, String description, int amount) {
        super(type, price, description);
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public void showDetails() {
        System.out.println("Coke:");
        System.out.println("  Type: " + getType());
        System.out.println("  Price: $" + getPrice());
        System.out.println("  Description: " + getDescription());
        System.out.println("  Amount: " + amount + " L");
    }
}
