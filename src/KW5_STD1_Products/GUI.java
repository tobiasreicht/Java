package KW5_STD1_Products;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import KW5_STD1_Products.product.Milk;
import KW5_STD1_Products.product.cheese;
import KW5_STD1_Products.product.product;
import KW5_STD1_Products.product.Eggs;

public class GUI {

    private   Scanner scanner = new Scanner(System.in);

    private List<product> cart = new ArrayList<>();

    private List<product> products = new ArrayList<>();

    public GUI() {
        init();
    }

    private void init() {
            Milk milk1 = new Milk(1, "Heumilch", "Heu");
            Milk milk2 = new Milk(2.5, "Sojamilch", "Soja");
            Milk milk3 = new Milk(3.0, "Mandelmilch", "Mandeln");
            Milk milk4 = new Milk(1.8, "Hafermilch", "Hafer");
            Milk milk5 = new Milk(2.2, "Kokosmilch", "Kokos");

            Eggs egg1 = new Eggs("Ei 12er", 10);
            Eggs egg2 = new Eggs("Ei 6er", 5);
            Eggs egg3 = new Eggs("Ei 24er", 20);
            Eggs egg4 = new Eggs("Bio-Ei 12er", 12);
            Eggs egg5 = new Eggs("Freiland-Ei 6er", 6);

            cheese cheese1 = new cheese("Gouda", 4.5, "Kuhmilch");
            cheese cheese2 = new cheese("Mozzarella", 3.8, "Büffelmilch");
            cheese cheese3 = new cheese("Cheddar", 5.0, "Kuhmilch");
            products.add(milk1);
            products.add(milk2);
            products.add(milk3);
            products.add(milk4);
            products.add(milk5);

            products.add(egg1);
            products.add(egg2);
            products.add(egg3);
            products.add(egg4);
            products.add(egg5);

            products.add(cheese1);
            products.add(cheese2);
            products.add(cheese3);

    }

    public void run() {
        System.out.println("das ist der shop");

        while (true) {
            System.out.println(" \n1. Show Products");
            System.out.println("2. add item to cart");
            System.out.println("3. Remove item from cart");
            System.out.println("4. View cart");
            System.out.println("5. Checkout");
            System.out.println("6. Exit");

            int selection = scanner.nextInt();
            switch (selection) {
                case 1:
                    printProducts();

                    break;
                case 2:
                    addProducts();

                    break;

                case 3:
                    removeProducts();

                    break;


                case 4:
                    viewCart();

                    break;

                case 5:
                    checkout();

                    break;

                case 6:
                    System.out.println("Danke für deinen Besuch!");
                    return;


                default:
                    break;


            }
        }}





        private void printProducts() {

            for (int i = 0; i < this.products.size(); i++) {
                product product = this.products.get(i);
                System.out.println((i + 1) + ": " + product.getName() + " - " + product.getPrice());
            }

        }





      private void addProducts() {
        while (true) {
            System.out.println("Gib die Nummer des Produkts ein, das du in den Warenkorb legen möchtest (oder 'n' zum Beenden):");

            if (scanner.hasNextInt()) { // Überprüfen, ob eine Zahl eingegeben wurde
                int i = scanner.nextInt();

                if (i < 1 || i > products.size()) {
                    System.out.println("Ungültige Nummer! Bitte erneut eingeben.");
                    continue; // Schleife wiederholen
                }

                product selectedProduct = products.get(i - 1);
                cart.add(selectedProduct);
                System.out.println(selectedProduct.getName() + " wurde dem Warenkorb hinzugefügt.");

            } else {
                String input = scanner.next(); // Eingabe als String lesen
                if (input.equalsIgnoreCase("n")) {
                    System.out.println("Hinzufügen beendet.");
                    break; // Schleife beenden
                } else {
                    System.out.println("Ungültige Eingabe! Bitte eine Zahl oder 'n' eingeben.");
                }
            }
        }
      }





    private void removeProducts() {

        System.out.println("Gib die Nummer des Produkts ein, das du entfernen möchtest:");
        int index = scanner.nextInt();

        if (index < 1 || index > cart.size()) {
            System.out.println("Ungültige Nummer!");
            return;
        }

        product removedProduct = cart.remove(index - 1);
        System.out.println(removedProduct.getName() + " wurde entfernt.");
    }





    private void viewCart() {
        if (cart.isEmpty()) {
            System.out.println("Dein Warenkorb ist leer!");
            return;
        }

        System.out.println("Dein Warenkorb");
        for (int i = 0; i < cart.size(); i++) {
            product p = cart.get(i);
            System.out.println((i + 1) + ". " + p.getName() + " - " + p.getPrice() + "€");
        }
    }






    private void checkout() {
         System.out.println("\n Dein Warenkorb ");
         double totalPrice = 0;
         for (int i = 0; i < cart.size(); i++) {
             product p = cart.get(i);
             System.out.println((i + 1) + ". " + p.getName() + " - " + p.getPrice() + "€");
             totalPrice += p.getPrice();
         }

         System.out.println("Gesamtpreis: " + totalPrice + "€");
     }
    }









