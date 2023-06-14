package Sem2.AiSD.pr1;
import java.util.Scanner;
class Fifth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите числа, разделённые пробелами: ");
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        
        int sum = 0;
        for (String number : numbers) {
            int n = Integer.parseInt(number);
            sum += n * n;
        }    
        System.out.println("Сумма квадратов: " + sum);
    }
}