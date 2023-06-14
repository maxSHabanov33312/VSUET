package Sem2.DOP.lesson1;
import java.util.Scanner;
class ConsoleInputApplication {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String day,month;
        System.out.println("Какой сегодня день?");
        day = input.nextLine();
        System.out.println("Какой месяц?");
        month = input.nextLine();
        String text;
        text = "Сегодня " + day + ", месяц - " + month;
        System.out.println(text);
    }
}