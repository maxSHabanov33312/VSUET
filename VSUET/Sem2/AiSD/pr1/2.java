package Sem2.AiSD.pr1;
import java.util.Scanner;
class Second{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите значение в формате: [1, 0, 1, 1, 1]: ");
        String input = sc.nextLine();
        // удаляем скобки и пробелы из ввода пользователя
        input = input.replaceAll("[\\[\\]\\s]", "");
        // переменная для хранения количества работников
        int employeeCount = 0;
        // проходимся по каждому символу в строке input
        for(int i=0; i<input.length(); i++){
           // преобразуем символ в boolean значение
           boolean value = (input.charAt(i) == '1');
           // если значение true, увеличиваем счетчик работников
           if(value){
              employeeCount++;
           }
        }
        System.out.println("Количество работников: " + employeeCount);
     }
}