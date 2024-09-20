import java.util.Random;

public class switch_aufgabe_1 {
    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber = random.nextInt(11-5)+5;


        switch(randomNumber){
            case 10:
                System.out.println("is 10");
            break;
            case 9:
                System.out.println("is 9");
            break;
            case 8:
                System.out.println("is 8");
                break;
            case 7:
                System.out.println("is 7");
                break;
            case 6:
                System.out.println("is 6");
                break;
            case 5:
                System.out.println("is 5");
            break;
        }



        // Erstelle eine Zufallszahl zwischen 5 und 10



// Wenn der Wert 10 ist gib aus Ten

// Wenn der Wert 9 ist gib aus Nine

// Wenn der Wert 8 ist gib aus Eight

// etc.
    }
}
