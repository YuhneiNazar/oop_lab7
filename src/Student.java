import java.util.Scanner;

class Student extends Human{
    private String specialty;
    private int course;

    public Student(){
    }
    public Student(String name, int age, String specialty, int course) {
        super(name, age);
        this.specialty = specialty;
        this.course = course;
    }

    public Student(Student other) {
        super(other);
        this.specialty = other.specialty;
        this.course = other.course;
    }

    public String Getspec() { return this.specialty;}
    public int Getcourse() { return this.course;}

    public void Setspec(String value) { this.specialty = value;}
    public void Setcourse(int value) { this.course = value;}

    public void ReadStud () {
        Scanner scan = new Scanner(System.in);
        super.Readhuman();
        System.out.println("Введіть спеціальність:");
        specialty = scan.nextLine();
        System.out.println("Введіть курс:");
        course = scan.nextInt();
    }
    public void  PrintStud () {
        super.Printhuman();
        System.out.println("Спеціальність: " + specialty);
        System.out.println("Курс: " + course);
    }
}
