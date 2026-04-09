import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        System.out.println(list);
        Integer[] A = list.toArray(new Integer[0]);
        for (Integer i : A) {
            System.out.println(i);
        }

    }
}
