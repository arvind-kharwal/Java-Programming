import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        Collection<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.forEach(n -> System.out.println(n));
        boolean res = numbers.isEmpty();
        System.out.println(res);
    }
}
