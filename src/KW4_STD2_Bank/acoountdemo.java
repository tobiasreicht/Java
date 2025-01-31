package KW4_STD2_Bank;
import java.util.Scanner;
public class acoountdemo {
    public static void main(String[] args) {

        Bankaccount ID001 = new Bankaccount("Tobias Reicht", 100);

        //erweiterung der aufgabe, eigene eingabe

        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben Sie Ihre ID ein:");
        String Id = scanner.nextLine();

        Bankaccount userAccount = new Bankaccount(Id, 0);

        while (true) {
            System.out.println("\nGeben Sie eine Zahl ein, um eine Aktion auszuführen:");
            System.out.println("1. Einzahlen");
            System.out.println("2. Abheben");
            System.out.println("3. Kontostand anzeigen");
            System.out.println("4. Beenden");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Geben Sie den Betrag ein, den Sie einzahlen möchten:");
                    double depositAmount = scanner.nextDouble();
                    userAccount.deposit(depositAmount);
                    break;
                case 2:
                    System.out.println("Geben Sie den Betrag ein, den Sie abheben möchten:");
                    double withdrawAmount = scanner.nextDouble();
                    userAccount.withdraw(withdrawAmount);
                    break;
                case 3:
                    userAccount.displayBalance();
                    break;
                case 5:
                    System.out.println("wie heißt die neue Bank");
                    String newBank = scanner.nextLine();
                    userAccount.changeBankName(newBank);
                case 4:
                    System.out.println("Programm beendet.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Ungültige Eingabe, bitte erneut versuchen.");
            }
        }
    }


}
