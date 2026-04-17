import java.util.*;

class Student2 {
    int r;
    String name;

    Student2(int r, String name) {
        this.r = r;
        this.name = name;
    }
}

public class List2 {
    public static void main(String[] args) {
        List<Student2> list = new ArrayList<>();
        list.add(new Student2(3, "Chandan"));
        list.add(new Student2(7, "Dhanush"));
        list.add(new Student2(1, "Arvind"));
        Collections.sort(list, (S1, S2) -> S1.name.compareTo(S2.r));
        for (Student2 i : list) {
            System.out.println(i.r + " " + i.name);
        }
    }
}