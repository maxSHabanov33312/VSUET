package Sem2.AiSD.pr1;
import java.util.Scanner;
class Seventh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int n = scanner.nextInt();
        int lower = (int) Math.floor(Math.sqrt(n)); // ближайший меньший квадрат
        int upper = (int) Math.ceil(Math.sqrt(n)); // ближайший больший квадрат
        if (Math.abs(n - lower * lower) < Math.abs(n - upper * upper)) {
            System.out.println("Изначальное число: " + lower);
        } else {
            System.out.println("Изначальное число: " + upper);
        }
    }
}