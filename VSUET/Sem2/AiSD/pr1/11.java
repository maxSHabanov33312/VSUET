package Sem2.AiSD.pr1;
import java.util.Scanner;
class Eleventh{
    public static void main(String[] args) {
        System.setProperty("console.encoding", "cp866");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();
        String result = removeVowels(input);
        System.out.println("Результат: " + result);
    }

    private static String removeVowels(String input) {
        System.setProperty("console.encoding", "cp866");
        String vowels = "аеёиоуыэюяАЕЁИОУЫЭЮЯ";
        StringBuilder resultBuilder = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (vowels.indexOf(c) == -1) { // если буква не является гласной, то добавляем ее в результат
                resultBuilder.append(c);
            }
        }
        return resultBuilder.toString();
    }
}