import java.util.*;

public class Findany1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Arvind", "Amit", "Yuvaan", "Jiya");
        Optional<String> names = list.stream()
                .filter(name -> name.startsWith("A"))
                .findAny()
                .map(name -> name.toUpperCase());

        System.out.println(names.get());
    }
}
