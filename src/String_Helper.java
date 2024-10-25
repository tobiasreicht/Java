import java.util.Scanner;

public class String_Helper {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);




        System.out.println("Geben Sie ein Wort ein:");
        String word = scanner.nextLine();

        boolean isPalindrome = isPalindrome(word);
        if (isPalindrome) {
            System.out.println("Palindrom: true");
        } else {
            System.out.println("Palindrom: false");
        }

        System.out.println("Geben Sie den zu zählenden Buchstaben ein:");
        char characterToCount = scanner.next().charAt(0);

        int amount = countLetters(word, characterToCount);
        System.out.println("Der Buchstabe " + characterToCount + " kommt " + amount + " Mal vor.");


        scanner.close();
    }


    public static boolean isPalindrome(String word) {
        String reversed = new StringBuilder(word).reverse().toString();
        return word.equalsIgnoreCase(reversed);
    }


    public static int countLetters(String word, char c) {
        int amount = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == c) {
                amount++;
            }
        }
        return amount;
    }


}
