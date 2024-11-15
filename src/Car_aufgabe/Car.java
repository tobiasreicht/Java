package Car_aufgabe;

public class Car {
    int fuelConsumption;
    String brand;
    String serialNumber;
    String color;
    int fuelLevel;
    int tankVolume;

    public Car(String brand, String serialNumber, int fuelConsumption, int fuelLevel, int tankVolume) {
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.fuelConsumption = fuelConsumption;
        this.fuelLevel = fuelLevel;
        this.tankVolume = tankVolume;
    }


    public void brake() {
        System.out.println("Ich bremse");
    }


    public void turboBoost() {
        if (fuelLevel > 0.1 * tankVolume) {
            System.out.println("SuperBoostMode");
        } else {
            System.out.println("Not enough fuel to go to Superboost");
        }
    }

    public void honk(int amountOfRepetitions) {
        for (int i = 0; i < amountOfRepetitions; i++) {
            System.out.println("Tuuut");
        }
    }

    // Methode zur Berechnung der Restreichweite
    public int remainingRange() {
        return (int) ((fuelLevel / (double) fuelConsumption) * 100);
    }
}
