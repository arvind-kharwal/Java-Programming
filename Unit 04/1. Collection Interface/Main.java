import java.util.Arrays;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Collection<Integer> numbers = Arrays.asList(1, 2, 3);
        numbers.add(4);
        numbers.add(5);
        System.out.println(numbers);
    }
}
