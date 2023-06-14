package Sem2.AiSD.pr2;
import java.util.Scanner;
class pavapepe{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int maxIndex = 0;
        for (int i = 1; i < size; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }

        int[] leftArray = new int[maxIndex];
        for (int i = 0; i < maxIndex; i++) {
            leftArray[i] = array[i];
        }

        int[] rightArray = new int[size - maxIndex - 1];
        for (int i = maxIndex + 1; i < size; i++) {
            rightArray[i - maxIndex - 1] = array[i];
        }

        System.out.println("Максимальное значение: " + array[maxIndex]);
        System.out.println("Элементы слева от максимума:");
        for (int i = 0; i < maxIndex; i++) {
            System.out.print(leftArray[i] + " ");
        }
        System.out.println();
        System.out.println("Элементы справа от максимума:");
        for (int i = 0; i < size - maxIndex - 1; i++) {
            System.out.print(rightArray[i] + " ");
        }
    }
}
