import java.util.*;
import java.util.stream.Collectors;

public class Distinct {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Arvind", "Arvind", "Yuvaan", "Jiya");
        List<String> names = list.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(names);
    }
}
