package KW4_STD2_Bank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class acoountdemo {
    public static void main(String[] args) {
        Map<String, Bankaccount> accounts = new HashMap<>();

        Bankaccount ID001 = new Bankaccount("Tobias Reicht", 100);  accounts.put("ID001", ID001);
        Bankaccount ID002 = new Bankaccount("Andrej barbobobic", 50); accounts.put("ID002", ID002);
        Bankaccount ID003 = new Bankaccount("Max Mustermann", 500); accounts.put("ID003", ID003);
        Bankaccount ID004 = new Bankaccount("Erika Musterfrau", 1200); accounts.put("ID004", ID004);
        Bankaccount ID005 = new Bankaccount("John Doe", 300);accounts.put("ID005", ID005);
        Bankaccount ID006 = new Bankaccount("Jane Smith", 750);accounts.put("ID006", ID006);
        Bankaccount ID007 = new Bankaccount("Alice Johnson", 1000);accounts.put("ID007", ID007);
        Bankaccount ID008 = new Bankaccount("Bob Brown", 250);accounts.put("ID008", ID008);
        Bankaccount ID009 = new Bankaccount("Charlie Davis", 600);accounts.put("ID009", ID009);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben Sie Ihre ID ein:");
        String userId = scanner.nextLine();


        Bankaccount userAccount = accounts.get(userId);
        if (userAccount == null) {
            System.out.println("Konto mit der ID " + userId + " existiert nicht. Ein neues Konto wird erstellt.");
            userAccount = new Bankaccount(userId, 0);
            accounts.put(userId, userAccount);
        }

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
