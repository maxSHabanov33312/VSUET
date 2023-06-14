package Sem2.AiSD.pr1;
import java.util.Scanner;
class Third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите координаты вершин треугольника:");
        
        // задаем координаты трех вершин треугольника
        System.out.print("x1 = ");
        double x1 = sc.nextDouble();
        System.out.print("y1 = ");
        double y1 = sc.nextDouble();
        System.out.print("x2 = ");
        double x2 = sc.nextDouble();
        System.out.print("y2 = ");
        double y2 = sc.nextDouble();
        System.out.print("x3 = ");
        double x3 = sc.nextDouble();
        System.out.print("y3 = ");
        double y3 = sc.nextDouble();
  
        // находим координаты точек, где медианы пересекают стороны треугольника
        double xE = (x2 + x3) / 2.0;
        double yE = (y2 + y3) / 2.0;
        double xD = (x1 + x3) / 2.0;
        double yD = (y1 + y3) / 2.0;
        double xF = (x1 + x2) / 2.0;
        double yF = (y1 + y2) / 2.0;
  
        // находим координаты барицентра треугольника
        double xB = (xE + xD + xF) / 3.0;
        double yB = (yE + yD + yF) / 3.0;
  
        // выводим результат на экран
        System.out.printf("Барицентр треугольника: {%.4f, %.4f}", xB, yB);
     }
}
