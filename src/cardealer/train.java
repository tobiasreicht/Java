package cardealer;

public class train extends abstractvehicle {
    train(String Name, int ID){
        super(Name,ID);
    }

    public void drive() {
        System.out.println(getName() + "makes... brummm");
    }
}

