import java.util.Scanner;


public class Main1 {
    static void divide(int a, int b) throws Throwable{
        int r = a/b;
        System.out.println(r);
        
    }
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = S.nextInt();
        int b = S.nextInt();
        try{
            divide(a,b);
        }
        catch(Throwable e){
            System.out.println(e.getMessage());
        }
        finally{
            S.close();
        }
    }
}
