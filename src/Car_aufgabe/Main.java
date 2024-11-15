package Car_aufgabe;

import Car_aufgabe.Car;

public class Main {
    public static void main(String[] args) {

        Car c1 = new Car("Audi", "A123", 7, 50, 60);
        Car c2 = new Car("Porsche", "P123", 6, 5, 60);

        c1.brake();


        c1.turboBoost();
        c2.turboBoost();

        c1.honk(3);
        c2.honk(5);


        System.out.println("Restreichweite von " + c1.brand + ": " + c1.remainingRange() + " km");
        System.out.println("Restreichweite von " + c2.brand + ": " + c2.remainingRange() + " km");


        System.out.println("Seriennummer von " + c1.brand + ": " + c1.serialNumber);
        System.out.println("Marke: " + c2.brand);
    }
}
