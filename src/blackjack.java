import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;


public class blackjack {
    public static void main(String[] args) {
        String[] cards = {
                // Herz (♥)
                "\n┌─────────┐\n│ A       │\n│         │\n│    ♥    │\n│         │\n│       A │\n└─────────┘",
                "\n┌─────────┐\n│ 2       │\n│         │\n│    ♥    │\n│         │\n│       2 │\n└─────────┘",
                "\n┌─────────┐\n│ 3       │\n│         │\n│    ♥    │\n│         │\n│       3 │\n└─────────┘",
                "\n┌─────────┐\n│ 4       │\n│         │\n│    ♥    │\n│         │\n│       4 │\n└─────────┘",
                "\n┌─────────┐\n│ 5       │\n│         │\n│    ♥    │\n│         │\n│       5 │\n└─────────┘",
                "\n┌─────────┐\n│ 6       │\n│         │\n│    ♥    │\n│         │\n│       6 │\n└─────────┘",
                "\n┌─────────┐\n│ 7       │\n│         │\n│    ♥    │\n│         │\n│       7 │\n└─────────┘",
                "\n┌─────────┐\n│ 8       │\n│         │\n│    ♥    │\n│         │\n│       8 │\n└─────────┘",
                "\n┌─────────┐\n│ 9       │\n│         │\n│    ♥    │\n│         │\n│       9 │\n└─────────┘",
                "\n┌─────────┐\n│ 10      │\n│         │\n│    ♥    │\n│         │\n│      10 │\n└─────────┘",
                "\n┌─────────┐\n│ J       │\n│         │\n│    ♥    │\n│         │\n│       J │\n└─────────┘",
                "\n┌─────────┐\n│ Q       │\n│         │\n│    ♥    │\n│         │\n│       Q │\n└─────────┘",
                "\n┌─────────┐\n│ K       │\n│         │\n│    ♥    │\n│         │\n│       K │\n└─────────┘",

                // Karo (♦)
                "\n┌─────────┐\n│ A       │\n│         │\n│    ♦    │\n│         │\n│       A │\n└─────────┘",
                "\n┌─────────┐\n│ 2       │\n│         │\n│    ♦    │\n│         │\n│       2 │\n└─────────┘",
                "\n┌─────────┐\n│ 3       │\n│         │\n│    ♦    │\n│         │\n│       3 │\n└─────────┘",
                "\n┌─────────┐\n│ 4       │\n│         │\n│    ♦    │\n│         │\n│       4 │\n└─────────┘",
                "\n┌─────────┐\n│ 5       │\n│         │\n│    ♦    │\n│         │\n│       5 │\n└─────────┘",
                "\n┌─────────┐\n│ 6       │\n│         │\n│    ♦    │\n│         │\n│       6 │\n└─────────┘",
                "\n┌─────────┐\n│ 7       │\n│         │\n│    ♦    │\n│         │\n│       7 │\n└─────────┘",
                "\n┌─────────┐\n│ 8       │\n│         │\n│    ♦    │\n│         │\n│       8 │\n└─────────┘",
                "\n┌─────────┐\n│ 9       │\n│         │\n│    ♦    │\n│         │\n│       9 │\n└─────────┘",
                "\n┌─────────┐\n│ 10      │\n│         │\n│    ♦    │\n│         │\n│      10 │\n└─────────┘",
                "\n┌─────────┐\n│ J       │\n│         │\n│    ♦    │\n│         │\n│       J │\n└─────────┘",
                "\n┌─────────┐\n│ Q       │\n│         │\n│    ♦    │\n│         │\n│       Q │\n└─────────┘",
                "\n┌─────────┐\n│ K       │\n│         │\n│    ♦    │\n│         │\n│       K │\n└─────────┘",

                // Pik (♠)
                "\n┌─────────┐\n│ A       │\n│         │\n│    ♠    │\n│         │\n│       A │\n└─────────┘",
                "\n┌─────────┐\n│ 2       │\n│         │\n│    ♠    │\n│         │\n│       2 │\n└─────────┘",
                "\n┌─────────┐\n│ 3       │\n│         │\n│    ♠    │\n│         │\n│       3 │\n└─────────┘",
                "\n┌─────────┐\n│ 4       │\n│         │\n│    ♠    │\n│         │\n│       4 │\n└─────────┘",
                "\n┌─────────┐\n│ 5       │\n│         │\n│    ♠    │\n│         │\n│       5 │\n└─────────┘",
                "\n┌─────────┐\n│ 6       │\n│         │\n│    ♠    │\n│         │\n│       6 │\n└─────────┘",
                "\n┌─────────┐\n│ 7       │\n│         │\n│    ♠    │\n│         │\n│       7 │\n└─────────┘",
                "\n┌─────────┐\n│ 8       │\n│         │\n│    ♠    │\n│         │\n│       8 │\n└─────────┘",
                "\n┌─────────┐\n│ 9       │\n│         │\n│    ♠    │\n│         │\n│       9 │\n└─────────┘",
                "\n┌─────────┐\n│ 10      │\n│         │\n│    ♠    │\n│         │\n│      10 │\n└─────────┘",
                "\n┌─────────┐\n│ J       │\n│         │\n│    ♠    │\n│         │\n│       J │\n└─────────┘",
                "\n┌─────────┐\n│ Q       │\n│         │\n│    ♠    │\n│         │\n│       Q │\n└─────────┘",
                "\n┌─────────┐\n│ K       │\n│         │\n│    ♠    │\n│         │\n│       K │\n└─────────┘",

                // Kreuz (♣)
                "\n┌─────────┐\n│ A       │\n│         │\n│    ♣    │\n│         │\n│       A │\n└─────────┘",
                "\n┌─────────┐\n│ 2       │\n│         │\n│    ♣    │\n│         │\n│       2 │\n└─────────┘",
                "\n┌─────────┐\n│ 3       │\n│         │\n│    ♣    │\n│         │\n│       3 │\n└─────────┘",
                "\n┌─────────┐\n│ 4       │\n│         │\n│    ♣    │\n│         │\n│       4 │\n└─────────┘",
                "\n┌─────────┐\n│ 5       │\n│         │\n│    ♣    │\n│         │\n│       5 │\n└─────────┘",
                "\n┌─────────┐\n│ 6       │\n│         │\n│    ♣    │\n│         │\n│       6 │\n└─────────┘",
                "\n┌─────────┐\n│ 7       │\n│         │\n│    ♣    │\n│         │\n│       7 │\n└─────────┘",
                "\n┌─────────┐\n│ 8       │\n│         │\n│    ♣    │\n│         │\n│       8 │\n└─────────┘",
                "\n┌─────────┐\n│ 9       │\n│         │\n│    ♣    │\n│         │\n│       9 │\n└─────────┘",
                "\n┌─────────┐\n│ 10      │\n│         │\n│    ♣    │\n│         │\n│      10 │\n└─────────┘",
                "\n┌─────────┐\n│ J       │\n│         │\n│    ♣    │\n│         │\n│       J │\n└─────────┘",
                "\n┌─────────┐\n│ Q       │\n│         │\n│    ♣    │\n│         │\n│       Q │\n└─────────┘",
                "\n┌─────────┐\n│ K       │\n│         │\n│    ♣    │\n│         │\n│       K │\n└─────────┘"
        };


        Scanner input = new Scanner(System.in);

        ArrayList<String> deck = new ArrayList<>();
        for (String card : cards) {
            deck.add(card);
        }


        int bank = 100;

        System.out.println("möchtest du spielen? (J/N)");
        String start = input.nextLine().toUpperCase();




        int playerTotal = 0;
        ArrayList<String> playerHand = new ArrayList<>();

        int dealerTotal = 0;
        ArrayList<String> dealerHand = new ArrayList<>();



        sleep(2000);
        System.out.println("Der Spieler zieht zwei Karten...");
        sleep(2000);
        playerTotal += pullCard(deck, playerHand, true);
        sleep(2000);
        playerTotal += pullCard(deck, playerHand, true);
        sleep(1000);
        System.out.println("Spielerhand: \n" + playerHand);
        sleep(2000);
        System.out.println("\n Gesamt: " + playerTotal);

        sleep(2000);
        System.out.println("Der Dealer zieht zwei Karten...");
        int firstCardValue = pullCard(deck, dealerHand, false);
        dealerTotal += firstCardValue;
        dealerTotal += pullCard(deck, dealerHand, true);

        sleep(2000);
        System.out.println("Dealerhand: \n" +
                "┌─────────┐ \n" +
                "│ ######## │ \n" +
                "│ ######## │ \n" +
                "│ ######## │ \n" +
                "│ ######## │ \n" +
                "│ ######## │ \n" +
                "└─────────┘ \n " + dealerHand.get(1) + "]");

        boolean playerTurn = true;

        while (playerTurn && playerTotal < 21) {
            System.out.println("Möchtest du eine weitere Karte ziehen? (J/N)");
            String choice = input.nextLine().toUpperCase();

            if (choice.equals("J")) {
                playerTotal += pullCard(deck, playerHand, true);
                sleep(2000);
                System.out.println("Spielerhand: \n" + playerHand);
                sleep(2000);
                System.out.println("\n Gesamt: " + playerTotal);
            } else if (choice.equals("N")) {
                playerTurn = false;
            } else {
                System.out.println("Ungültige Eingabe! Bitte 'J' oder 'N' eingeben.");
            }
        }

        if (playerTotal > 21) {
            System.out.println("Spieler hat überzogen! Dealer gewinnt.");
            return;
        }

        sleep(2000);
        System.out.println("Der Dealer deckt seine erste Karte auf: \n" + dealerHand.get(0));
        sleep(2000);
        System.out.println("Dealerhand: \n" + dealerHand);
        sleep(2000);
        System.out.println("Gesamt: " + dealerTotal);
        // Dealer spielt

        while (dealerTotal < 17) {
            sleep(2000);
            System.out.println("Der Dealer zieht eine Karte...");
            dealerTotal += pullCard(deck, dealerHand, true);
        }
        sleep(2000);
        System.out.println("Dealerhand: \n" + dealerHand + " \n Gesamt: " + dealerTotal);

        sleep(2000);
        System.out.println("Endergebnisse:");
        sleep(1000);
        System.out.println("Spielerhand: \n Gesamt: " + playerTotal);
        sleep(2000);
        System.out.println("Dealerhand: \n Gesamt: " + dealerTotal);
        sleep(1000);

        if (playerTotal > 21) {
            System.out.println("Spieler hat überzogen! Dealer gewinnt.");
        } else if (dealerTotal > 21) {
            System.out.println("Dealer hat überzogen! Spieler gewinnt.");
        } else if (playerTotal > dealerTotal) {
            System.out.println("Der Spieler gewinnt!");
        } else if (dealerTotal > playerTotal) {
            System.out.println("Der Dealer gewinnt!");
        } else {
            System.out.println("Unentschieden!");
        }
    }

    public static int pullCard(ArrayList<String> deck, ArrayList<String> hand, boolean showCard) {
        Random random = new Random();
        int randomIndex = random.nextInt(deck.size());
        String drawnCard = deck.remove(randomIndex);
        hand.add(drawnCard);

        if (showCard) {
            sleep(2000);
            System.out.println("Gezogene Karte: \n" + drawnCard);
        }

        return getCardNumber(drawnCard);
    }

    public static int getCardNumber(String card) {

        String[] cardParts = card.split(" ");
        String cardValue = cardParts[1];

        switch (cardValue) {
            case "Bube":
            case "Dame":
            case "König":
            case "J":
            case "Q":
            case "K":
                return 10;
            case "A":
                return 11;
            default:
                return Integer.parseInt(cardValue);
        }
    }

    private static void sleep(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    }


