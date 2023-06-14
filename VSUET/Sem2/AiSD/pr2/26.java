package Sem2.AiSD.pr2;
import org.jetbrains.annotations.NotNull;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();
        int maxLength = 0;
        String longestPalindrome = "";
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                String substring = input.substring(i, j);
                if (isPalindrome(substring) && substring.length() > maxLength) {
                    maxLength = substring.length();
                    longestPalindrome = substring;
                }
            }
        }
        System.out.println("Длиннейший палиндром в строке: " + longestPalindrome.length());
    }
    private static boolean isPalindrome(@NotNull String s) {
        int length = s.length();
        for (int i = 0; i < length / 2; i++) {
            if (s.charAt(i) != s.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}