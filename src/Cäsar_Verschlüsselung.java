import java.util.Scanner;
public class Cäsar_Verschlüsselung {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben Sie ein, was Sie tun wollen: \n1 - Verschlüsseln \n2 - Entschlüsseln");
        int auswahl = scanner.nextInt();
        scanner.nextLine();

        if (auswahl == 1) {
            System.out.print("Geben Sie den Text ein, den Sie verschlüsseln wollen: ");
            String plaintext = scanner.nextLine();

            System.out.print("Geben Sie den Schlüssel ein: ");
            int key = scanner.nextInt();

            String ciphertext = code(plaintext, key);
            System.out.println("Klartext: " + plaintext + " ---> Geheimtext: " + ciphertext);
        }
        else if (auswahl == 2) {
            System.out.print("Geben Sie den Geheimtext ein, den Sie entschlüsseln wollen: ");
            String ciphertext = scanner.nextLine();

            System.out.print("Geben Sie den Schlüssel ein: ");
            int key = scanner.nextInt();

            String decoded = decode(ciphertext, key);
            System.out.println("Geheimtext: " + ciphertext + " ---> Entschlüsselter Text: " + decoded);
        }
        else {
            System.out.println("Ungültige Auswahl. Bitte wählen Sie 1 oder 2.");
        }

        scanner.close();
}

    public static String code(String plaintext, int key) {
        String ciphertext = "";
        for(int i=0; i<plaintext.length(); i++){
            char next = plaintext.charAt(i);
            ciphertext = ciphertext + shift(next, key);

        }
        return ciphertext;
    }

    public static char shift(char letter, int shift) {
        if(letter >='a' && letter <='z') {
            letter += shift;
                 while(letter > 'z') {
                letter -= 26;
                 }
                while (letter < 'a') {
                    letter += 26;
                }
            } else if (letter >= 'A' && letter <= 'Z') {
                letter += shift;
                while (letter > 'Z') {
                    letter -= 26;
                }
                while (letter < 'A') {
                    letter += 26;
                }
            }


        return letter;
    }

    public static String decode(String ciphertext, int key) {
        String decoded = "";
        for(int i=0; i < ciphertext.length(); i++) {
            char next = ciphertext.charAt(i);
            decoded += shift(next, 26-key);
        }
        return decoded;
    }
}

