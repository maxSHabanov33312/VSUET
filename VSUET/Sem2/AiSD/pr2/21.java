package Sem2.AiSD.pr2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число с нампада: ");
        String input = scanner.nextLine();

        String output = "";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            switch (c) {
                case '1':
                    output += "9";
                    break;
                case '2':
                    output += "8";
                    break;
                case '3':
                    output += "7";
                    break;
                case '4':
                    output += "6";
                    break;
                case '5':
                    output += "5";
                    break;
                case '6':
                    output += "4";
                    break;
                case '7':
                    output += "3";
                    break;
                case '8':
                    output += "2";
                    break;
                case '9':
                    output += "1";
                    break;
                case '0':
                    output += "0";
                    break;
                default:
                    System.out.println("Ошибка: введен некорректный символ");
                    return;
            }
        }

        String result = "";
        for (int i = 0; i < output.length(); i++) {
            char c = output.charAt(i);
            switch (c) {
                case '1':
                    result += "1";
                    break;
                case '2':
                case 'A':
                case 'B':
                case 'C':
                    result += "2";
                    break;
                case '3':
                case 'D':
                case 'E':
                case 'F':
                    result += "3";
                    break;
                case '4':
                case 'G':
                case 'H':
                case 'I':
                    result += "4";
                    break;
                case '5':
                case 'J':
                case 'K':
                case 'L':
                    result += "5";
                    break;
                case '6':
                case 'M':
                case 'N':
                case 'O':
                    result += "6";
                    break;
                case '7':
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                    result += "7";
                    break;
                case '8':
                case 'T':
                case 'U':
                case 'V':
                    result += "8";
                    break;
                case '9':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    result += "9";
                    break;
                case '0':
                    result += "0";
                    break;
            }
        }

        System.out.println("Результат: " + result);
    }
}