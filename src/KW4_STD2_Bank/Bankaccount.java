package KW4_STD2_Bank;

public class Bankaccount {
//Erstelle ein Programm, das ein Bankkonto simuliert. Du sollst dabei Instanzvariablen, statische Variablen und Methoden verwenden.
//Erstelle ein einfaches CommandLine GUI dazu
//Anforderungen:
//Instanzvariablen:
//Jedes Konto hat einen eigenen Kontoinhaber (owner) und Kontostand (balance).
//Statische Variablen:
//Es gibt eine statische Variable bankName, die für alle Konten den Namen der Bank speichert.
//Methoden:
//Instanzmethoden:
//deposit(amount): Erhöht den Kontostand um den Betrag amount.
//withdraw(amount): Verringert den Kontostand um den Betrag amount, falls genug Guthaben vorhanden ist. Andernfalls gibt sie eine Warnung aus.
//displayBalance(): Gibt den aktuellen Kontostand aus.
//Statische Methode:
//changeBankName(newName): Ändert den Namen der Bank.

    private static String bank = "Maze Bank";
    private String Owner;
    private double amount;

    public Bankaccount (String Owner, double amount){
        this.Owner = Owner;
        this.amount = amount;

    }

    public static void changeBankName (String newName) {

        bank = newName;
    }

    public void deposit (double amount) {
        if(amount > 0) {
            this.amount += amount;
            System.out.println(amount + " wurde eingezahlt, es befinden sich jetzt " + this.amount + "€ auf dem konto" );
        } else  {
            System.out.println("bitte positive zahl");
            
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.amount) {
            this.amount -= amount;
            System.out.println( amount + " wurde erfolgreich abgehoben, es befinden sich jetzt " + this.amount + "€ auf dem konto");
        }
            else if (amount >= this.amount) {
                System.out.println("du hast zu wenig geld, haha");
            } else {
                System.out.println("bitte gültiger betrag");
            }
        }

    public void displayBalance() {
        System.out.println(Owner + ", Ihr aktueller Kontostand beträgt: " + amount + "€ und sie sind bei der bank " + bank);
    }

}

