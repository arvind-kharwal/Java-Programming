import java.util.Scanner;

public class Input1 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int a = S.nextInt();
        int b = S.nextInt();
        int r = a+b;
        System.out.println(r);
        S.close();
        
    }
}
