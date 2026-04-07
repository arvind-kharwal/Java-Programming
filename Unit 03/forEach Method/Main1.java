import java.util.*;
import java.util.function.Consumer;
public class Main1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        System.out.println("The list is: "+list);
        Consumer<Integer> C = (Integer n)-> System.out.print(n);
        list.forEach(C);
    }
}
