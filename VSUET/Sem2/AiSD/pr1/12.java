package Sem2.AiSD.pr1;
import java.util.Scanner;
class Twelfth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите два числа: ");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        if (firstNumber > secondNumber) {
            int temp = firstNumber;
            firstNumber = secondNumber;
            secondNumber = temp;
        }
        int currentNumber = firstNumber;
        while (currentNumber <= secondNumber) {
            System.out.print(currentNumber * currentNumber + " ");
            currentNumber += firstNumber;
        }
    }
}
