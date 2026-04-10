import java.util.*;

public class Findany {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Arvind", "Amit", "Yuvaan", "Jiya");
        Optional<String> names = list.stream()
                .filter(name -> name.startsWith("A"))
                .findAny();
        // names.ifPresent(n -> System.out.println(n));
        // if (names.isPresent()) {
        // System.out.println(names.get());
        // }
        if (names.isPresent()) {
            System.out.println(names.get());
        } else
            System.out.println("Not available");
    }
}
