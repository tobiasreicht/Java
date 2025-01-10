package KW2_STD1_car;

public class car extends Vehicle {
    private int doorNumbers;

    public car(String vehicleBrand, int numberOfdoors) {
        super(vehicleBrand);
        doorNumbers = numberOfdoors ;
    }

    public int getDoors() {
        return doorNumbers;
    }

    public void honkCar () {
        System.out.println("TÜÜÜÜÜÜÜTT TÜÜÜÜTTTTT");
    }

    public void getDetails() {
        System.out.println( brand + " makes BRUUUUUUUUUUUUUMMMMMMMMMMMMMMMMMMMMMMM");
    }

}
