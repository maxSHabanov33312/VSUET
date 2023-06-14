package Sem2.AiSD.pr1;
import java.util.Scanner;
class First{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество строк матрицы: ");
        int rows = sc.nextInt();
        System.out.print("Введите количество столбцов матрицы: ");
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        System.out.println("Введите элементы матрицы: ");
        for(int i=0; i<rows; i++){
           for(int j=0; j<cols; j++){
              matrix[i][j] = sc.nextInt();
           }
         }
        System.out.println("Оригинальная матрица: ");
        for(int i=0; i<rows; i++){
           for(int j=0; j<cols; j++){
              System.out.print(matrix[i][j] + "\t");
           }
           System.out.println();
        }
        int[][] transpose = new int[cols][rows];
        for(int i=0; i<cols; i++){
           for(int j=0; j<rows; j++){
              transpose[i][j] = matrix[j][i];
           }
        }
        System.out.println("Транспонированная матрица: ");
        for(int i=0; i<cols; i++){
           for(int j=0; j<rows; j++){
              System.out.print(transpose[i][j] + "\t");
           }
           System.out.println();
        }
     }
} 