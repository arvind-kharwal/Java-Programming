import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        Integer[] a = { 1, 2, 3, 4 };
        List<Integer> list = new ArrayList<>();
        for (Integer i : a) {
            list.add(i);
        }
        // list.forEach(n -> System.out.println(n));
        System.out.println(list);
    }
}
