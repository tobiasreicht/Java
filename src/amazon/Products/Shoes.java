package amazon.Products;

public class Shoes extends AbstractProduct {
    private String color;

    public Shoes(String ID, float price, String Title, String Description, String color) {
        super(ID, price, Title, Description);
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
