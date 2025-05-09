package cardealer;

public class car extends abstractvehicle {

    car(String Name, int ID){
       super(Name,ID);
    }

    public void drive() {
        System.out.println(getName() + "makes... brummm");
    }
}
