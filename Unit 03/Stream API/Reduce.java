import java.util.*;
public class Reduce {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Integer res = list.stream()
        .reduce(0,(n,i)->n+i);
        System.out.println(res);

}
}