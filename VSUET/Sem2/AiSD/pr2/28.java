package Sem2.AiSD.pr2;
import java.util.Scanner;
class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = scanner.nextInt();
        int i = 1;
        while (i * i - (i - 1) * (i - 1) != n) {
            i++;
        }
        System.out.println(n + " = " + (i * i) + " - " + ((i - 1) * (i - 1)));
    }
}