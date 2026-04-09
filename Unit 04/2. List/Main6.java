import java.util.*;

public class Main6 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("C");
        list1.add("C++");
        System.out.println("List 1" + list1);
        List<String> list2 = new ArrayList<>();
        list2.add("Python");
        list2.add("Java");
        System.out.println("List 2" + list2);
        list1.addAll(0, list2);
        System.out.println("After Updating: " + list1);
    }
}
