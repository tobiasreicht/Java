package KW2_STD1_393_396;

public class Figure {
    private double xpos = 100.0, ypos = 100.0;

    public Figure(double x, double y){
        if (x >= 0 && y >= 0) {
            xpos = x;
            ypos = y;
        }
        System.out.println("Figur-Konstruktor");
    }

    public Figure() {
        System.out.println("Figur_Konstruktor");
    }
}