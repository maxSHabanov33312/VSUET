package Sem2.AiSD.pr1;
import java.util.Scanner;
class Eighth{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите длину первого отрезка: ");
            double a = scanner.nextDouble();
            System.out.print("Введите длину второго отрезка: ");
            double b = scanner.nextDouble();
            System.out.print("Введите длину третьего отрезка: ");
            double c = scanner.nextDouble();
    
            double maxAngle = 0;
            boolean isTriangle = false;
    
            if (a + b > c && a + c > b && b + c > a) {
                isTriangle = true; // проверяем, можно ли из отрезков собрать треугольник
                double cosA = (b * b + c * c - a * a) / (2 * b * c);
                double cosB = (a * a + c * c - b * b) / (2 * a * c);
                double cosC = (a * a + b * b - c * c) / (2 * a * b);
                double angleA = Math.toDegrees(Math.acos(cosA));
                double angleB = Math.toDegrees(Math.acos(cosB));
                double angleC = Math.toDegrees(Math.acos(cosC));
                maxAngle = Math.max(angleA, Math.max(angleB, angleC)); // находим максимальный внешний угол
            }
    
            if (isTriangle) {
                System.out.printf("Да, из отрезков длиной %.2f, %.2f и %.2f можно составить треугольник.\n", a, b, c);
                System.out.printf("Наибольший внешний угол треугольника: %.2f градусов.", maxAngle);
            } else {
                System.out.printf("Нет, из отрезков длиной %.2f, %.2f и %.2f невозможно составить треугольник.", a, b, c);
            }
        }
}