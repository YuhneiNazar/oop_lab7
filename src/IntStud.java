import java.util.Scanner;
public class IntStud extends Student{
    private String tasks;
    private int rating;

    public IntStud(){
    }
    public IntStud(String name, int age, String specialty, int course, String tasks, int rating) {
        super(name, age, specialty, course);
        this.tasks = tasks;
        this.rating = rating;
    }

    public IntStud(IntStud other) {
        super(other);
        this.tasks = other.tasks;
        this.rating = other.rating;
    }

    public String Gettasks() { return this.tasks;}
    public int Getrating() { return this.rating;}

    public void Settasks(String value) { this.tasks = value;}
    public void Setrating(int value) { this.rating = value;}

    public void ReadIntStud () {
        Scanner scan = new Scanner(System.in);
        super.ReadStud();
        System.out.println("Введіть завдання практики:");
        tasks = scan.nextLine();
        System.out.println("Введіть оцінку практики:");
        rating = scan.nextInt();
    }
    public void  PrintIntStud () {
        super.PrintStud();
        System.out.println("Завдання практики: " + tasks);
        System.out.println("Оцінка практики: " + rating);
    }
}
