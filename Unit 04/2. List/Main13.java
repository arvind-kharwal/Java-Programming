import java.util.*;

class Student {
    int r;
    String name;

    Student(int r, String name) {
        this.r = r;
        this.name = name;
    }
}

public class Main13 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "Arvind"));
        list.add(new Student(30, "Yuvaan"));
        list.add(new Student(11, "Jiya"));
        System.out.println("The data: ");
        list.forEach(n -> System.out.print(n));
        for (Student s : list) {
            System.out.println(s.r + " " + s.name);
        }
    }
}
