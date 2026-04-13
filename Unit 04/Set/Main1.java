import java.util.HashSet;
import java.util.Set;

public class Main1 {
    public static void main(String args[]) {
        Set<Integer> S = new HashSet<>();
        S.add(10);
        S.add(20);
        S.add(20);
        S.add(300);
        System.out.println("Set Elements: " + S);
    }
}