import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(-1);
        list.add(5);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

    }
}
