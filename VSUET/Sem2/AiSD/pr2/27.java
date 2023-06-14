package Sem2.AiSD.pr2;
import java.util.Scanner;
class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку для шифрования: ");
        String message = scanner.nextLine();

        System.out.print("Введите число сдвига: ");
        int shift = scanner.nextInt();

        System.out.print("Введите направление (1 - шифрование, -1 - дешифрование): ");
        int direction = scanner.nextInt();

        String result = caesarCipher(message, shift, direction);
        System.out.println("Результат: " + result);
    }

    public static String caesarCipher(String message, int shift, int direction) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);

            if (Character.isLetter(c)) {
                if (Character.isUpperCase(c)) {
                    c = (char) ((c - 'A' + shift * direction + 26) % 26 + 'A');
                } else {
                    c = (char) ((c - 'a' + shift * direction + 26) % 26 + 'a');
                }
            }

            result.append(c);
        }

        return result.toString();
    }
}