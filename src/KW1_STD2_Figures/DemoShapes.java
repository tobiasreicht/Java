package KW1_STD2_Figures;

public class DemoShapes {
    public static void main(String[] args) {
        circle circle1 = new circle(10);
            circle1.getareaCircle();
            circle1.getRadCirlce();
            circle1.describe();



        Rectangle rectangle1 = new Rectangle(100, 100);
            rectangle1.describe("oha des funktioniert!");
            rectangle1.getareaRectangle();

    }
}
