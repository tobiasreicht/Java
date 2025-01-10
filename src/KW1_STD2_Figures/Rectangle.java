package KW1_STD2_Figures;

public class Rectangle extends Shape{
    protected double width, height;

    public Rectangle (double rectangleWidth, double rectangleheight) {
        width = rectangleWidth;
        height = rectangleheight;
    }


    @Override
    public double area() {
        return height * width;
    }

    @Override
        public void describe() {
            System.out.println("This is a rectangle with width " + width + " and height " + height + ".");
        }


        public void describe(String description) {
            System.out.println("This is a rectangle described as: " + description);
        }

    public void getareaRectangle() {
        System.out.println("the area of the rectangle is " + area());
    }
}