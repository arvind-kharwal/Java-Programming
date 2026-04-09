import java.util.*;

public class Main8 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("C");
        list.add("C++");
        list.add("Python");
        list.add("C");
        System.out.println(list);
        int index = list.lastIndexOf("C");
        System.out.println("The Last index is: " + index);
    }
}
