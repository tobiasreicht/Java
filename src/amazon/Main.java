package amazon;

import amazon.GUI.GUI;
import amazon.GUI.CostumerGUI;
import amazon.Products.MobilePhones;
import amazon.Products.Products;
import amazon.Products.Shoes;

public class Main {
    public static void main(String[] args) {
        Amazon amazon = new Amazon();

        amazon.addProduct(new Shoes("101", 89.99F, "Adidas UltraBoost", "High performance running shoe", "Black"));
        amazon.addProduct(new Shoes("102", 109.99F, "Nike Air Max", "Comfortable street sneakers", "White"));
        amazon.addProduct(new Shoes("103", 79.99F, "Puma RS-X", "Retro-style running sneakers", "Blue"));
        amazon.addProduct(new Shoes("104", 99.99F, "Reebok Nano", "Training and fitness shoes", "Grey"));
        amazon.addProduct(new Shoes("105", 129.99F, "Asics Gel-Kayano", "Stability running shoes", "Red"));

        amazon.addProduct(new MobilePhones("201", 799.99F, "iPhone 14", "Apple smartphone with iOS", "Midnight"));
        amazon.addProduct(new MobilePhones("202", 699.99F, "Samsung Galaxy S23", "Android phone with great camera", "Black"));
        amazon.addProduct(new MobilePhones("203", 549.99F, "Google Pixel 7", "Stock Android experience", "Obsidian"));
        amazon.addProduct(new MobilePhones("204", 429.99F, "OnePlus 11", "Fast performance and charging", "Green"));
        amazon.addProduct(new MobilePhones("205", 199.99F, "Nokia G22", "Basic smartphone with long battery life", "Blue"));


        new CostumerGUI(amazon).start();


    }
}
