import java.util.*;
import java.util.stream.Collectors;

public class Sorted {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        List<Integer> res =  list.stream()
        .sorted()
        .collect(Collectors.toList());
        System.out.println(res);
}
}
