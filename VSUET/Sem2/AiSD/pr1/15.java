package Sem2.AiSD.pr1;
import java.util.Scanner;
import java.util.Arrays;
import java.util.HashSet;
class Fifteenth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();
        String[] words = input.split("\\s+");
        String[] uniqueWords = new HashSet<>(Arrays.asList(words)).toArray(new String[0]);
        System.out.println(String.join(" ", uniqueWords));
    }
}