import java.util.Random;

public class while_aufgabe_1 {
    public static void main(String[] args) {
        long result = 0;
        Random random =  new Random();
        int randomNumber = random.nextInt(31-10)+10;

        if (randomNumber == 15 || randomNumber == 25) {
            break;
        }

        System.out.println(randomNumber);

        result += randomNumber;
        System.out.println(result);
    }


}
