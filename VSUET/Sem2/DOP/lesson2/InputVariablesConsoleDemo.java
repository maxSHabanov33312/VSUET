package Sem2.DOP.lesson2;
import java.util.Scanner;
class InputVariablesConsoleDemo{
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        int now = 2023;
        String name;
        int age;
        double height;
        double mass;
        System.out.println("Ваше имя: ");
        name = input.nextLine();
        System.out.println("Ваш возраст: ");
        age = input.nextInt();
        System.out.print("Ваш рост (в метрах): ");
        height = input.nextDouble();
        System.out.print("Масса тела (в килограммах): ");
        mass = input.nextDouble();
        double bmi = mass/height/height;
        System.out.println("Здравствуйте, " + name + "!");
        System.out.println("Вы родились в " + (now - age) + " году.");
        System.out.printf("Ваш индекс массы тела: %5.2f\n",bmi);
    }
}