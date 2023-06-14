package Sem2.AiSD.pr1;
import java.util.Scanner;
class Sixteenth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();
        int upperCaseCount = 0;
        int lowerCaseCount = 0;
        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                upperCaseCount++;
            } else if (Character.isLowerCase(c)) {
                lowerCaseCount++;
            }
        }
        if (upperCaseCount > lowerCaseCount) {
            input = input.toUpperCase();
        } else if (upperCaseCount < lowerCaseCount || (upperCaseCount == 0 && lowerCaseCount == 0)) {
            input = input.toLowerCase();
        }
        System.out.println(input);
    }
}