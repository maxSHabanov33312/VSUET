package Sem2.AiSD.pr2;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
class main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите высоту m: ");
        int m = scanner.nextInt();
        System.out.print("Введите ширину n: ");
        int n = scanner.nextInt();

        int[][] array = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == m - 1 || j == 0 || j == n - 1) {
                    array[i][j] = 1;
                } else {
                    array[i][j] = array[i - 1][j] + 1;
                }
            }
        }

        try {
            FileWriter writer = new FileWriter("result.txt");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    writer.write(array[i][j] + " ");
                }
                writer.write("\n");
            }
            writer.close();
            System.out.println("Результат сохранен в файл result.txt");
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл");
            e.printStackTrace();
        }
    }
}
