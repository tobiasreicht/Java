package cardealer;
import java.util.ArrayList;
import java.util.List;



public class Main {
    public static void main(String[] args) {

        List<Vehicle> vehicleList = new ArrayList<>();

        Vehicle car = new car("Audi", 1);
        Vehicle train = new train("Siemens", 2);
        Vehicle aeroCar = new aerocar("Flycar", 3);

        System.out.println(car.getName());
    }
}