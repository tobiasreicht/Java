
//
//
//Create a base class called Vehicle with the following:
//
//A String field named brand.
//
//A method startEngine() that prints: "The engine of <brand> is starting."
//
//A constructor that initializes the brand field.
//
//Create a subclass called Car that extends Vehicle and includes:
//
//An additional int field named numberOfDoors.
//
//A method honk() that prints: "The <brand> car is honking!"
//
//A constructor that initializes both the brand and numberOfDoors.
//
//In the main() method of your program:
//
//Create an instance of Car.
//
//Call startEngine() and honk() methods on the Car instance.
//
//Print the number of doors of the car.
//
//
package KW2_STD1_car;

public class Vehicle {
    protected String brand;

    public Vehicle (String vehicleBrand){
        brand = vehicleBrand;
    }

    public String getBrand() {
        return brand;
    }


    public void startEngine () {
        System.out.println("the engine of" + brand + "is starting");
    }




}
