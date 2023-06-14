package Sem2.AiSD.pr1;
import java.util.Scanner;
import java.util.Arrays;
class Fourteenth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] storage = new int[3];
        int count = 0;
        while (count < 3) {
            System.out.print("Введите число: ");
            int number = scanner.nextInt();
            if (count == 0 || count == 1 || number >= storage[0] && number >= storage[1]) {
                storage[count] = number;
            } else if (number < storage[0]) {
                storage[0] = number;
            } else if (number < storage[1]) {
                storage[1] = number;
            } else {
                storage[2] = number;
            }
            count++;
            System.out.println(Arrays.toString(storage));
        }
        while (true) {
            System.out.print("Введите число: ");
            int number = scanner.nextInt();
            if (number < storage[0]) {
                storage[2] = storage[1];
                storage[1] = storage[0];
                storage[0] = number;
            } else if (number < storage[1]) {
                storage[2] = storage[1];
                storage[1] = number;
            } else if (number < storage[2]) {
                storage[2] = number;
            }
            System.out.println(Arrays.toString(storage));
        }
    }
}