import java.util.Scanner;
import java.util.Random;

public class wörter_raten {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String[] words = {
                "algorithmus", "compiler", "debugger", "schleife", "funktion",
                "variable", "array", "klasse", "objekt", "framework",
                "datenbank", "ki", "interface", "bibliothek", "aaron",
                "syntax", "exception", "git", "node", "script"
        };

        Random random = new Random();
        int randomIndex = random.nextInt(words.length);
        String randomWord = words[randomIndex];

        char[] guessedWord = new char[randomWord.length()];
            for (int i = 0; i < randomWord.length(); i++) {
                guessedWord[i] = '*';

        }

        while (true) {

            System.out.print("Aktuelles Wort: ");
            for (char c : guessedWord) {
                System.out.print(c);
            }

            System.out.println();

            System.out.print("Welcher Buchstabe könnte im gesuchten Wort stecken? ");
            String input = scanner.nextLine();

            if (input.length() == 1) {
                char letter = input.charAt(0);

                if (isLetterInWord(randomWord, letter)) {
                    System.out.println("Der Buchstabe " + letter + "befindet sich im Wort");

                    for (int i = 0; i < randomWord.length(); i++) {
                        if (randomWord.charAt(i) == letter) {
                            guessedWord[i] = letter;
                        }
                    }
                } else {
                    System.out.println("Der Buchstabe " + letter + "befindet sich nicht im Wort ");
                }
            } else {
                System.out.println("Bitte geben Sie einen Buchstaben ein.");
            }

            if (String.valueOf(guessedWord).equals(randomWord)) {
                System.out.println("GLÜCKWUNSCH das word war " + randomWord);
                break;
            }
        }

        scanner.close();
    }

    public static boolean isLetterInWord(String word, char letter) {
        return word.indexOf(letter) != -1;
    }
}