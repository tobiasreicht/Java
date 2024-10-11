import java.util.Random;
import java.util.Scanner;

public class würfelspiel {
    public static void main(String[] args) {

        Scanner scanner  = new Scanner(System.in);
        int augenSummePlayer = 0;
        int zuegePlayer = 6;

        int augenSummeComputer = 0;

        System.out.println("Geben sie 1 um das Spiel zu starten");
        String input = scanner.nextLine();

        if (input.equals("1")) {
            System.out.println("Sie würfeln . . .");
            Random random = new Random();
            int randomNumber = random.nextInt(6)+1;
            System.out.println(randomNumber);
            augenSummePlayer += randomNumber;
            zuegePlayer -= 1;
            System.out.println("sie haben "+ zuegePlayer +" Züge übrig");
            System.out.println("ihre Augensumme beträgt "+ augenSummePlayer);
        }

        boolean isFinished = false;

        while (!isFinished) {
        Scanner scannerWuerfeln  = new Scanner(System.in);
        System.out.println("Drücken sie 1 um erneut zu würfeln");
        String inputWuerfel = scanner.nextLine();

        if (inputWuerfel.equals("1")) {
            System.out.println("Sie würfeln . . .");
            Random random = new Random();
            int randomNumber = random.nextInt(6)+1;
            System.out.println(randomNumber);
            augenSummePlayer += randomNumber;
            zuegePlayer -= 1;
            System.out.println("sie haben "+ zuegePlayer +" Züge übrig");
            System.out.println("ihre Augensumme beträgt "+ augenSummePlayer);
        }

        if (zuegePlayer==0) {
            isFinished = true;
            Random randomC = new Random();
            int randomNumberC = randomC.nextInt(36)+6;
            augenSummeComputer += randomNumberC;
        }



        if (zuegePlayer == 0 && augenSummePlayer > augenSummeComputer) {
            System.out.println("Der Augenzahls des computers beträgt "+ augenSummeComputer);
            System.out.println("Sie haben gewonnen");
        } else if (zuegePlayer == 0 && augenSummeComputer > augenSummePlayer) {
            System.out.println("Der Augenzahls des computers beträgt "+ augenSummeComputer);
            System.out.println("Sie haben verloren");
            }
        }
    }
}
