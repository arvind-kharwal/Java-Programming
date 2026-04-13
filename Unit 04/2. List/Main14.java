import java.util.*;

class Student1 {
    int r;
    String name;

    Student1(int r, String name) {
        this.r = r;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student1 [r=" + r + ", name=" + name + "]";
    }

}

public class Main14 {
    public static void main(String[] args) {
        List<Student1> list = new ArrayList<>();
        list.add(new Student1(1, "Arvind"));
        list.add(new Student1(30, "Yuvaan"));
        list.add(new Student1(11, "Jiya"));
        System.out.println("The data: ");
        list.forEach(n -> System.out.print(n));
    }
}
