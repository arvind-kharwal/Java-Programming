import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;

public class Generate {
    public static void main(String[] args) {
        List<String> list = Stream.generate(() -> "Java")
                .limit(10)
                .collect(Collectors.toList());
        System.out.println(list);
    }
}
