package cardealer;

public abstract class abstractvehicle implements Vehicle  {
    private int ID;
    private String Name;

    abstractvehicle(String Name, int ID){
        this.Name = Name;
        this.ID = ID;
    }

    public String getName(){
        return Name;
    }

    public int getID() {
        return ID;
    }
}
