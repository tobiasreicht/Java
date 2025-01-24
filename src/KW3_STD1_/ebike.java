package KW3_STD1_;

public class ebike extends Bikes{
    protected int akkuKapacity;

    public ebike(int wheels, String color, String brand, int akkuKapacity) {
        super(wheels,color,brand);
        this.akkuKapacity = akkuKapacity;
    }

    @Override
    public void drive() {
        System.out.println("your electric bike drives ... ZZZZZZZZzZzZ");
    }

    public void getdetails() {
        System.out.println("the bike from " + brand + " has the color" + color + " and " + wheels + " wheels and the battery has " + akkuKapacity + " megawatt");
    }
}
