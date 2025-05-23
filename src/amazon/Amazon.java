package amazon;
import amazon.Products.AbstractProduct;
import amazon.Products.Products;

import java.util.*;
import java.util.ArrayList;

public class Amazon {
        private List<AbstractProduct> products = new ArrayList<>();
        private List<AbstractProduct> cart = new ArrayList<>();



        public void addProduct(AbstractProduct p) {
            products.add(p);
        }


        public void showAllProducts() {
            for (AbstractProduct p : products) {
                System.out.println(p);
            }
        }



        public double getStockValue() {
            double sum = 0;
            for (AbstractProduct p : products) {
                sum += p.getPrice();
            }
            return sum;
        }




        public void addToCart(String productID){
            for (AbstractProduct p : products) {
                if (p.getID().equals(productID)) {
                    cart.add(p);
                    System.out.println("Added to cart: " + p);
                    return;
                }
            }
            System.out.println("Product not found.");
        }



        public void showCart() {
            System.out.println("Cart:");
            for (Products p : cart) {
                System.out.println(p);
            }
        }
    }
