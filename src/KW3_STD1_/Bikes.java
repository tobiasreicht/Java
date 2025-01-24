package KW3_STD1_;

public class Bikes {
    protected int wheels;
    protected String color;
    protected String brand;

    public Bikes(int wheels, String color, String brand) {
        this.wheels = wheels;
        this.color = color;
        this.brand = brand;
    }

    public void getdetails() {
        System.out.println("the bike from " + brand + " has the color" + color + " and " + wheels + " wheels");
    }



    public void drive() {
        System.out.println("your " + brand + " Bike drives.. Sssss");
    }

    public void ring() {
        System.out.println("RIINNGGG");
    }
}
