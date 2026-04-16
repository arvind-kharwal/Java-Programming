import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

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

public class Main1 {
    public static void main(String[] args) {
        List<Student1> list = new ArrayList<>();
        list.add(new Student1(1, "Yuvaan", 90.34));
        list.add(new Student1(13, "Jiya", 96.30));
        list.add(new Student1(8, "Advika", 95.34));

        // Sorting by roll using lambda
        Collections.sort(list, (s1, s2) -> s1.name.compareTo(s2.name));

        for (Student1 s : list) {
            System.out.println(s.roll + " " + s.name + " " + s.per);
        }
    }
}
