package Sem2.AiSD.pr1;
import java.util.Scanner;
class Thirteenth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите начало ряда, шаг и количество шагов: ");
        int start = scanner.nextInt();
        int step = scanner.nextInt();
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            System.out.print(start + " ");
            start += step;
        }
    }
}
