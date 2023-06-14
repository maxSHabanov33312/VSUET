import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;
class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение x: ");
        int x = scanner.nextInt();
        int y = 2 * x + 1;
        int z = 3 * x + 1;
        Set <Integer> set = new TreeSet<>(); // создаем множество для хранения уникальных значений u
        set.add(1); // добавляем первое значение в множество
        int i = 2; // начинаем считать со второго значения
        while (true) {
            int u = i % 2 == 0 ? y + i / 2 : z + (i - 1) / 2; // вычисляем текущее значение u
            if (u > 100) break; // ограничиваем максимальным значением
            set.add(u); // добавляем в множество
            i++;
        }
        System.out.println(set); // выводим уникальные значения в порядке возрастания
    }
}