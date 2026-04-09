import java.util.*;

public class Main6 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("C");
        list1.add("C++");
        System.out.println(list1);
        List<String> list2 = new ArrayList<>();
        list2.add("Python");
        list2.add("Java");
        System.out.println(list2);
        List<String> list3 = new ArrayList<>();
        list3.add("Java");
        list3.addAll(0, list1);
        System.out.println("After Updating: " + list3);
    }
}
