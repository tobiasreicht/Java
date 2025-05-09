package cardealer;

public class aerocar extends car {

    public aerocar(String Name, int ID) {
        super(Name, ID);
    }

    public void fly() {
        System.out.println(getName() + " is flying!");
    }
}
