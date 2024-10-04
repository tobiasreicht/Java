import java.util.Random;

public class while_aufgabe_1 {
    public static void main(String[] args) {

        long result = 0;
        Random random = new Random();
        while (true) {
            int randomNumber = random.nextInt(21) + 10;
            System.out.println(randomNumber);

            if (randomNumber == 15 || randomNumber == 25) {
                break;
            }

            result += randomNumber;
        }

        System.out.println("Summe der Zufallszahlen: " + result);
    }
}