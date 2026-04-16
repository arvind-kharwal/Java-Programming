import java.util.HashMap;
import java.util.Map;

public class Main1 {
    public static void main(String[] args) {
        Map<Integer, String> M1 = new HashMap<>();
        M1.put(1, "A");
        M1.put(2, "B");
        M1.put(3, "A");
        Map<Integer, String> M2 = new HashMap<>();
        M2.put(1, "C");
        M2.put(20, "B");
        M2.put(30, "A");
        System.out.println(M1);
        System.out.println(M2);
    }
}
