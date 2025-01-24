package KW3_STD1_;

public class demobikes {
    public static void main(String[] args) {

        BioBike bioBike1 = new BioBike(2, "blue","KTM");

        bioBike1.drive();
        bioBike1.ring();
        bioBike1.getdetails();

        ebike ebike1 = new ebike(2, "orange", "Canyon", 1000);

        ebike1.drive();
        ebike1.getdetails();

    }
}
