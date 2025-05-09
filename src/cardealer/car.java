package cardealer;

public class car implements Vehicle {
    private int ID;
    private String Name;

    car(String Name, int ID){
        this.Name = Name;
        this.ID = ID;
    }

    public String getName(){
        return Name;
    }

    public int getID() {
        return ID;
    }

    public void drive() {
        System.out.println(Name + "makes... brummm");
    }
}
