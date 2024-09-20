import java.util.Random;

public class IfBedingungen1 {
    public static void main(String[] args) {

        Random random = new Random();
        int randomnumber = random.nextInt(100);

        if (randomnumber < 20){
            System.out.println(randomnumber + "mini");
        } else if (randomnumber > 20) {
            System.out.println(randomnumber + "medium");
        } else {
            System.out.println(randomnumber + "Large");
        }
    }
}
