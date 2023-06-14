package Sem2.AiSD.pr3;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

class Main {
    private Map<Integer, Integer> cache = new HashMap<>();

    public int fusc(int n) {
        if (n < 2) {
            return n;
        }
        if (cache.containsKey(n)) {
            return cache.get(n);
        }
        int result;
        if (n % 2 == 0) {
            result = fusc(n / 2);
        } else {
            result = fusc(n / 2) + fusc(n / 2 + 1);
        }
        cache.put(n, result);
        return result;
    }

    public int[] fuscSequence(int n) {
        int[] sequence = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            sequence[i] = fusc(i);
        }
        return sequence;
    }

    public int fuscSum(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += fusc(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        Main f = new Main();
        System.out.println(f.fusc(7));
        System.out.println(Arrays.toString(f.fuscSequence(8)));
        System.out.println(f.fuscSum(7));
    }
}
