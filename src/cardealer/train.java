package cardealer;

public class train implements Vehicle {
    private String Name;
    private int ID;

    public train(String Name, int ID) {
        this.Name = Name;
        this.ID = ID;
    }

    public String getName() {
        return(Name);
    }

    public int getID() {
        return(ID);
    }

    public void drive() {
        System.out.println(Name + " fährt auf Schienen.");
    }
}
