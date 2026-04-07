import java.io.FileInputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner S = new Scanner(System.in);
        FileInputStream FIS = new FileInputStream("demo.txt")){
            System.out.println("Enter the number: ");
            int n = S.nextInt();
            System.out.println("The entered number is: "+n);
            byte b[] = FIS.readAllBytes();
            String str = new String(b);
            System.out.println("The string read from demo.txt file");
            System.out.println(str);
        }catch(Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
