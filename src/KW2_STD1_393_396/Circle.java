package KW2_STD1_393_396;

public class Circle extends Figure {
    private double radius = 50.0;

    public Circle(double x, double y, double rad) {
        super(x, y);
        if (rad >= 0 ) {
            radius = rad;
        }
        System.out.println("Kreis-Konstruktor");
    }

    public Circle () {
        System.out.println("Kreis-Konstruktor");
    }
}
