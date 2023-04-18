import java.util.Scanner;
public class Human {
    private String name;
    private int age;

    //конструктор ініціалізації без аргументів
    public Human () {

    }

    // Конструктор з аргументами
    public Human(String n, int a) {
        this.name = n;
        this.age = a;
    }

    // Конструктор копіювання
    public Human(Human other) {
        this.name = other.name;
        this.age = other.age;
    }
    public String Getname() { return this.name;}
    public int Getage() { return this.age;}

    public void Setname(String value) { this.name = value;}
    public void Setage(int value) { this.age = value;}

    public void Readhuman () {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть імя:");
        name = scan.nextLine();
        System.out.println("Введіть вік:");
        age = scan.nextInt();
        scan.nextLine();
    }
    public void  Printhuman () {
        System.out.println("Імя:"+name);
        System.out.println("Вік:"+age);
    }
}
