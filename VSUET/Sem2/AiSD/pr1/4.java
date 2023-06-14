package Sem2.AiSD.pr1;
import java.util.Scanner;
class Fourth{
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Введите строку: ");
      String str = sc.nextLine();
      System.out.print("Введите символ: ");
      char ch = sc.nextLine().charAt(0);
      int count = 0;
      for(int i=0; i<str.length(); i++){
         if(str.charAt(i) == ch){
            count++;
         }
      }
      System.out.println("Количество вхождений символа '" + ch + "': " + count);
   }
}