package Sem2.AiSD.pr1;
import java.util.*;
class Tenth{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = scanner.nextLine();
        String formattedName = formatName(name);
        System.out.println("Привет, " + formattedName + "!");
    }
    private static String formatName(String name) {
        String firstLetter = name.substring(0, 1).toUpperCase();
        String restLetters = name.substring(1).toLowerCase();
        return firstLetter + restLetters;
    }
}