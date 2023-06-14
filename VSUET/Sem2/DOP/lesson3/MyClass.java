package lesson3;
public class MyClass {
    String encoding = System.getProperty("console.encoding", "cp866");
    private static int count = 0;
    private int number;
    private String name;
    MyClass(String n){
        count++;
        name = n;
        number = count;
        System.out.println("Создан объект с именем" + name);
    }
    public void show(){
        System.out.println("Название объекта: " + name);
        System.out.println("Номер объекта: " + number);
        System.out.println("Колличество объектов: " + count);
    }
    public void set(String n){
        name = n;
    }
}