import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        Collection<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        System.out.println(numbers);
        numbers.forEach(n -> System.out.println(n));
    }
}
