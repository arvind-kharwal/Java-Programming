import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Sort {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(32);
        list.add(3);
        list.add(2);
        list.add(23);
        list.add(27);
        System.out.println(list);
        Collections.sort(list);
        System.out.println("Sorted: " + list);
    }
}
