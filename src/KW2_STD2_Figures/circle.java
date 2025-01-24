package KW2_STD2_Figures;

public class circle extends Shape{
    protected double rad;


    public circle(double radius){
        rad = radius;
    }



    @Override
    public double area() {
        return Math.PI * rad * rad;
        }

    @Override
    public void describe () {
        System.out.println("this is a circle with the radius" + rad);
    }

    public double getRad() {
        return rad;
    }

    public void getareaCircle() {
        System.out.println("the area of the circle is " + area());
    }

    public void getRadCirlce() {
        System.out.println("The radius is " + rad);
    }
}
