import java.util.ArrayList;
import java.util.List;

class Student1 {
    int roll;
    String name;
    double per;

    public Student1(int roll, String name, double per) {
        this.roll = roll;
        this.name = name;
        this.per = per;
    }
}

public class UserDefList {
    public static void main(String[] args) {
        List<Student1> list = new ArrayList<>();
        list.add(new Student1(1, "Yuvaan", 90.34));
        list.add(new Student1(13, "Jiya", 96.30));
        list.add(new Student1(8, "Advika", 95.34));
        for (Student1 s : list) {
            System.out.println(s.roll + " " + s.name + " " + s.per);
        }
        list.remove(0);
        System.out.println("Updated list after Deletion: ");
        for (Student1 s : list) {
            System.out.println(s.roll + " " + s.name + " " + s.per);
        }
    }
}
