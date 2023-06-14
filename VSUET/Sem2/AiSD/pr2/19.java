package Sem2.AiSD.pr2;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
class main{
    private static Map<Integer, Integer> cache = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int n = scanner.nextInt();

        int result = calculateFunc(n);
        System.out.println("func(" + n + ") = " + result);
    }

    private static int calculateFunc(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (cache.containsKey(n)) {
            return cache.get(n);
        } else {
            int result;
            if (n % 2 == 0) {
                result = calculateFunc(n / 2);
            } else {
                result = calculateFunc(n / 2) + calculateFunc(n / 2 + 1);
            }
            cache.put(n, result);
            return result;
        }
    }
}