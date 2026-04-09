import java.util.*;

public class Main5 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("C");
        list.add("C++");
        System.out.println(list);
        List<String> list1 = new ArrayList<>();
        list1.add("Python");
        list1.add("Java");
        System.out.println(list1);
        list.addAll(list1);
        System.out.println("After Updating: " + list);
    }
}
