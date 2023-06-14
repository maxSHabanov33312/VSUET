package Sem2.AiSD.pr2;
import java.util.Scanner;
class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число N: ");
        int n = scanner.nextInt();
        System.out.print("Введите делитель a: ");
        int a = scanner.nextInt();
        System.out.print("Введите делитель b: ");
        int b = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % a == 0 || i % b == 0) {
                sum += i;
            }
        }
        System.out.println("Сумма чисел, делящихся на " + a + " или " + b + ": " + sum);
    }
}