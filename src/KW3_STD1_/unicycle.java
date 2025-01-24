package KW3_STD1_;

public class unicycle extends Bikes{
    protected int wheel = 1;

    public unicycle(int wheel, String color, String brand){
        super(color,brand);
        this.wheel = wheel;
    }
}
