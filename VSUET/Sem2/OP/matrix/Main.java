package Sem2.OP.matrix;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите стороны матрицы: ");
        int n = scanner.nextInt();

        Matrix matrix = new Matrix(n);

        System.out.println(matrix);

        System.out.println("Результат умножения чисел на главной диагонали: " + matrix.mainDiagonalUmn());
        System.out.println("Сумма чисел выше главной диагонали: " + matrix.nadDiagonalSum());
        System.out.println("Вычитание суммы чисел под главной диагонали от 0: " + matrix.podDiagonalMin());

        scanner.close();
    }
}