package Sem2.OP.matrix;
import java.util.Random;
import java.util.Arrays;
public class Matrix {
    private int[][] matrix;
    public Matrix(int n){
        Random rand = new Random();
        matrix = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                matrix[i][j] = rand.nextInt(10);
            }
        }
    }
    public String toString() {
        String str = Arrays.deepToString(matrix)
                .replace("], ", "]\n")
                .replace("[[", "[")
                .replace("]]", "]");
        return "---Matrix---\n" + str;
    }   
    public int mainDiagonalUmn(){
        int result = 1;
        for (int i = 0; i < matrix.length; i++){
            result *= matrix[i][i];
        }
        return result;
    }
    public int nadDiagonalSum(){
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix.length; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }
    public int podDiagonalMin(){
        int diff = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                diff -= matrix[i][j];
            }
        }
        return diff;
    }
}