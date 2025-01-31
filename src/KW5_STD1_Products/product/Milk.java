package KW5_STD1_Products.product;


public class Milk implements product {
    private double price;
    private String name;
    private String sort;

    public Milk(double price, String name, String sort) {
        this.price = price;
        this.name = name;
        this.sort = sort;
    }

    public String getName() {
        return name;
    }


    public double getPrice() {
        return price;
    }

}