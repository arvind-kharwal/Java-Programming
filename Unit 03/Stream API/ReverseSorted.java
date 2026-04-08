import java.util.*;
import java.util.stream.Collectors;
public class ReverseSorted {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(11,22,3,-4,15);
        List<Integer> res =  list.stream()
        .sorted(Comparator.reverseOrder())
        .collect(Collectors.toList());
        System.out.println("Reverse order: "+res);
        res.forEach(n->System.out.println(n));
}

}
