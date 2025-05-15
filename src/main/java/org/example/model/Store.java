package org.example.model;

public class Store {
    public static void main(String[] args) {

        ProductForSale[] inventory = new ProductForSale[] {
                new Chocolate("Dark", 2.5, "Rich dark chocolate", 70),
                new Coke("Cola", 1.5, "Refreshing soda drink", 1),
                new Bread("Whole Wheat", 3.0, "Freshly baked bread", "Whole Wheat")
        };

        listProducts(inventory);
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
        }
    }
}