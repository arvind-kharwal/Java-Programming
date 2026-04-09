import java.util.*;

public class Main7 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("C");
        list.add("C++");
        list.add("Python");
        list.add("Java");
        System.out.println(list);
        int index = list.indexOf("C");
        System.out.println("The index is" + index);
    }
}
