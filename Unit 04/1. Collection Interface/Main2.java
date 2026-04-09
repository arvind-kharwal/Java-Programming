import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Collection<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.forEach(n -> System.out.println(n));
        numbers.clear();
        System.out.println("After clearing");
        System.out.println(numbers);
        numbers.forEach(n -> System.out.println(n));
    }
}
