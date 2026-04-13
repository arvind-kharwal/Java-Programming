import java.util.Arrays;
import java.util.List;

public class Peek {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Arvind", "Yuvaan", "Amit");
        names.stream()
                .filter(name -> name.startsWith("A"))
                .peek(n -> System.out.println(n))
                .map(String::toUpperCase)
                .forEach(name -> System.out.println(name));
    }
}
