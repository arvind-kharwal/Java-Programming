import java.util.HashMap;
import java.util.Map;

public class Main2 {
    public static void main(String[] args) {
        Map<Integer, String> M1 = new HashMap<>();
        M1.put(1, "A");
        M1.put(2, "B");
        M1.put(3, "A");
        System.out.println(M1);
        M1.put(2, "Java");
        System.out.println(M1);
    }
}
