package Sem2.AiSD.pr2;
import java.util.Scanner;
class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите начало ряда M: ");
        int m = scanner.nextInt();
        System.out.print("Введите конец ряда N: ");
        int n = scanner.nextInt();
        System.out.print("Введите количество делителей: ");
        int count = scanner.nextInt();
        int[] divisors = new int[count];
        System.out.println("Введите делители:");
        for (int i = 0; i < count; i++) {
            divisors[i] = scanner.nextInt();
        }
        int sum = 0;
        boolean isDivisible;
        for (int i = m; i <= n; i++) {
            isDivisible = true;
            for (int j = 0; j < count; j++) {
                if (i % divisors[j] != 0) {
                    isDivisible = false;
                    break;
                }
            }
            if (isDivisible) {
                sum += i;
            }
        }
        System.out.println("Сумма чисел, делящихся на все делители: " + sum);
    }
}