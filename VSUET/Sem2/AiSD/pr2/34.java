package Sem2.AiSD.pr2;
import java.util.Scanner;
import java.util.*;
class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите список весов через пробел: ");
        String input = scanner.nextLine();

        // Разбиваем строку на массив чисел
        String[] weights = input.split(" ");

        // Создаем новый массив, в котором будут храниться суммы чисел веса
        int[] sums = new int[weights.length];

        // Вычисляем суммы чисел веса и записываем их в новый массив
        for (int i = 0; i < weights.length; i++) {
            int sum = 0;
            for (int j = 0; j < weights[i].length(); j++) {
                sum += Character.getNumericValue(weights[i].charAt(j));
            }
            sums[i] = sum;
        }

        // Сортируем массив сумм и одновременно переставляем элементы в массиве весов
        for (int i = 0; i < sums.length - 1; i++) {
            for (int j = i + 1; j < sums.length; j++) {
                if (sums[i] < sums[j]) {
                    int tempSum = sums[i];
                    sums[i] = sums[j];
                    sums[j] = tempSum;

                    String tempWeight = weights[i];
                    weights[i] = weights[j];
                    weights[j] = tempWeight;
                }
            }
        }

        // Выводим отсортированный список
        System.out.println("Отсортированный список:");
        for (String weight : weights) {
            System.out.print(weight + " ");
        }
    }
}