import java.util.*;
public class Main2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        System.out.println("The list is: "+list);
        list.forEach((Integer n)-> System.out.print(n));
    }
}
