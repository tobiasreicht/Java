import java.util.Scanner;

public class bankomat {
    public static void main(String[] args) {

        int Kontostand = 0;
        Scanner scanner = new Scanner(System.in);
        boolean isFinished = false;

        while (!isFinished) {
            System.out.println("Geben Sie folgende Dinge ein, um folgende Dinge zu tun: \n1. Einzahlen\n2. Abheben\n3. Kontostand\n4. Beenden ");
            String input = scanner.nextLine();

            if (input.equals("1")) {
                System.out.println("Geben Sie ein, wieviel Sie einzahlen wollen:");
                int moneyInput = scanner.nextInt();
                Kontostand += moneyInput;
                System.out.println("Ihr Kontostand beträgt " + Kontostand);
                scanner.nextLine();
            }
            else if (input.equals("2")) {
                System.out.println("Geben Sie ein, wieviel Sie abheben möchten:");
                int moneyOutput = scanner.nextInt();
                Kontostand += moneyOutput;
                System.out.println("Ihr Kontostand beträgt " + Kontostand);
                scanner.nextLine();
            }
            else if (input.equals("3")) {
                System.out.println("Ihr Kontostand beträgt aktuell in diesem Moment " + Kontostand);
                scanner.nextLine();
            }
            else if (input.equals("4")) {
                System.out.println("auf wiedersehen LG");
                isFinished = true;
            }

    }
}
}
//
//Diese Aufgabe setzt sich aus allen gelernten Inhalten zusammen!
//
//Erstelle ein Programm, das einen Bankomaten simuliert. Folgende Möglichkeiten gibt es:
//
//1. Einzahlen
//
//2. Abheben
//
//3. Kontostand
//
//4. Beenden
//
//Folgendes Video zeigt dir die Funktionsweise