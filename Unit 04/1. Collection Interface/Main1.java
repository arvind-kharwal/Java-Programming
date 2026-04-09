import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        Collection<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        System.out.println(numbers);
        numbers.forEach(n -> System.out.println(n));
        numbers.remove(10);
        numbers.forEach(n -> System.out.println(n));
    }
}
