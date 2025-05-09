package cardealer;
import java.util.ArrayList;
import java.util.List;


public class cardealer {
    private List<Vehicle> vehicleList;

    public cardealer() {
        this.vehicleList = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicleList.add(vehicle);
        System.out.println("Fahrzeug hinzugefügt: " + vehicle.getName());
    }


    public void printVehicles() {
        System.out.println(vehicleList);


    }
}
