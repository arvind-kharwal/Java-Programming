import java.util.ArrayList;
import java.util.List;

public class Main11 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("C");
        list.add("C++");
        list.add("Python");
        System.out.println(list);
        boolean res = list.contains("C");
        System.out.println(res);
    }
}
