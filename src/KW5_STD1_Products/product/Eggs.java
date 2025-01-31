package KW5_STD1_Products.product;

public class Eggs implements product {
    private String name;
    private double price;

    public Eggs (String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice(){
        return price;
    }

}
