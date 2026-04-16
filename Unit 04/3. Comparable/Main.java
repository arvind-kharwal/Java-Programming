import java.util.ArrayList;
import java.util.List;

class Student {
    int roll;
    String name;
    double per;

    public Student(int roll, String name, double per) {
        this.roll = roll;
        this.name = name;
        this.per = per;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "Yuvaan", 90.34));
        list.add(new Student(13, "Jiya", 96.30));
        list.add(new Student(8, "Advika", 95.34));
        for (Student s : list) {
            System.out.println(s.roll + " " + s.name + " " + s.per);
        }
    }
}