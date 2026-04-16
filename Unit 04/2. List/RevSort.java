import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class RevSort {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(32);
        list.add(3);
        list.add(2);
        list.add(23);
        list.add(27);
        System.out.println("Original: " + list);
        Collections.sort(list);
        System.out.println("Sorted: " + list);
        Collections.sort(list, Comparator.reverseOrder());
        System.out.println("Reverse sorted: +list");
    }
}
