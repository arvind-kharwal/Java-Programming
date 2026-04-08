import java.util.*;
import java.util.stream.Collectors;

public class Sorted1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(11,22,3,-4,15);
        List<Integer> res =  list.stream()
        .sorted()
        .map(n->n*2)
        .collect(Collectors.toList());
        System.out.println(res);
}
}
