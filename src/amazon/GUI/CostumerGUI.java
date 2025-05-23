package amazon.GUI;
import java.util.Scanner;
import amazon.Amazon;
import amazon.Products.AbstractProduct;
import amazon.Products.Products;
import amazon.Products.Shoes;


public class CostumerGUI implements GUI {
    private Amazon amazon;

    public CostumerGUI(Amazon amazon) {
        this.amazon = amazon;
        }
            public void start() {
                Scanner scanner = new Scanner(System.in);
                while (true) {
                    System.out.println("\n--- Customer Menu ---");
                    System.out.println("1. Show all Products");
                    System.out.println("2. Show stock value");
                    System.out.println("3. Add to cart by ID");
                    System.out.println("4. Show cart");
                    System.out.println("0. Exit");
                    System.out.print("Choice: ");
                    int choice = scanner.nextInt();
                    scanner.nextLine(); // clear newline

                    switch (choice) {
                        case 1 -> amazon.showAllProducts();
                        case 2 -> System.out.println("Total stock value: €" + amazon.getStockValue());
                        case 3 -> {
                            System.out.print("Enter product ID: ");
                            String id = scanner.nextLine();
                            amazon.addToCart(id);
                        }
                        case 4 -> amazon.showCart();
                        case 0 -> {
                            System.out.println("Goodbye!");
                            return;
                        }
                        default -> System.out.println("Invalid choice.");
                    }
                }
            }
        }

