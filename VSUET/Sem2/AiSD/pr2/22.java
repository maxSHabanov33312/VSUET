package Sem2.AiSD.pr2;
import java.util.Scanner;
class main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сторону a: ");
        double a = scanner.nextDouble();
        System.out.print("Введите сторону b: ");
        double b = scanner.nextDouble();
        System.out.print("Введите сторону c: ");
        double c = scanner.nextDouble();

        double p = (a + b + c) / 2; // полупериметр
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c)); // формула Герона для вычисления площади

        System.out.println("Площадь треугольника: " + s);
    }
}  