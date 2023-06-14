package Sem2.AiSD.pr2;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class main {
    public static void main(String[] args) {
        List<Integer> distances = Arrays.asList(50, 55, 57, 58, 60);
        int maxDistance = chooseBestSum(175, 3, distances);
        System.out.println(maxDistance); // Output: 173
    }

    public static int chooseBestSum(int maxDistance, int citiesCount, List<Integer> distances) {
        List<List<Integer>> combinations = new ArrayList<>();
        generateCombinations(combinations, new ArrayList<>(), distances, citiesCount);

        int maxSum = -1;
        for (List<Integer> combination : combinations) {
            int sum = getSum(combination);
            if (sum <= maxDistance && sum > maxSum) {
                maxSum = sum;
            }
        }

        return maxSum;
    }

    private static void generateCombinations(List<List<Integer>> result, List<Integer> current, List<Integer> distances, int citiesCount) {
        if (current.size() == citiesCount) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < distances.size(); i++) {
            if (current.isEmpty() || distances.get(i) > current.get(current.size() - 1)) {
                current.add(distances.get(i));
                generateCombinations(result, current, distances, citiesCount);
                current.remove(current.size() - 1);
            }
        }
    }
    private static int getSum(List<Integer> distances) {
        int sum = 0;
        for (int i = 0; i < distances.size() - 1; i++) {
            sum += distances.get(i + 1) - distances.get(i);
        }
        return sum;
    }
}