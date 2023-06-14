package Sem2.AiSD.pr2;
import java.util.Scanner;
class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер элемента ряда Фибоначчи (10 ≤ i ≤ 100000): ");
        int n = scanner.nextInt();

        // Вычисляем i-ый элемент ряда Фибоначчи
        long a = 0, b = 1, c;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println("f(" + n + ") = " + b);

        // Считаем количество вхождений каждой цифры в числе
        int[] count = new int[10];
        while (b > 0) {
            count[(int) (b % 10)]++;
            b /= 10;
        }

        // Находим цифру с максимальным количеством вхождений
        int maxDigit = 0, maxCount = 0;
        for (int i = 0; i < 10; i++) {
            if (count[i] >= maxCount) {
                maxDigit = i;
                maxCount = count[i];
            }
        }
        System.out.println("Наибольшее количество вхождений у цифры " + maxDigit);
    }
}