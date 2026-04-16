import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class Student implements Comparable<Student> {
    int roll;
    String name;
    double per;

    public Student(int roll, String name, double per) {
        this.roll = roll;
        this.name = name;
        this.per = per;
    }

    // public int compareTo(Student S) {
    // if (roll == S.roll)
    // return 0;
    // else if (roll > S.roll)
    // return 1;
    // else
    // return -1;
    // }
    public int compareTo(Student S) {
        if (per == S.per)
            return 0;
        else if (per > per)
            return 1;
        else
            return -1;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "Yuvaan", 90.34));
        list.add(new Student(13, "Jiya", 96.30));
        list.add(new Student(8, "Advika", 95.34));
        Collections.sort(list);
        for (Student s : list) {
            System.out.println(s.roll + " " + s.name + " " + s.per);
        }
    }
}