package Sem2.AiSD.pr1;
import java.util.Scanner;
class Ninth{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первую строку: ");
        String first = scanner.nextLine();
        System.out.print("Введите вторую строку: ");
        String second = scanner.nextLine();
        boolean isEnding = checkEnding(first, second);
        System.out.println(isEnding);
    }
    private static boolean checkEnding(String first, String second) {
        if (second.length() > first.length()) {
            return false; // если вторая строка длинее первой, то она не может быть ее окончанием
        }
        int length = second.length();
        String ending = first.substring(first.length() - length);
        return ending.equals(second);
    }
}