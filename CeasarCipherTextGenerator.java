import java.util.Scanner;
public class CeasarCipherTextGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.nextLine();
        System.out.print("Enter shift: ");
        int shift = scanner.nextInt();
        String encryptedText = encrypt(text, shift);
        String decryptedText = decrypt(encryptedText, shift);
        System.out.println("Encrypted text: " + encryptedText);
        System.out.println("Decrypted text: " + decryptedText);
    }
    private static String encrypt(String text, int shift) {
        StringBuilder encryptedText = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                encryptedText.append((char) ((c - base + shift) % 26 + base));
            } else {
                encryptedText.append(c);
            }
        }
        return encryptedText.toString();
    }
    private static String decrypt(String text, int shift) {
        return encrypt(text, 26 - shift);
    }
}



