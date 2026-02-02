import java.io.InputStreamReader;
import java.io.BufferedReader;
public class Input2 {
    public static void main(String[] args) throws Exception{
        System.out.println("Enter your number: ");
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(in);
        int n = Integer.parseInt(b.readLine());
        System.out.println(n);
    }
    
}
