import java.util.*;
import java.util.stream.Collectors;

public class Sorted {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(11,22,3,-4,15);
        List<Integer> res =  list.stream()
        .sorted()
        .collect(Collectors.toList());
        System.out.println(res);
}
}
