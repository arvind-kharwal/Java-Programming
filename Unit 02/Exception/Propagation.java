import java.util.Scanner;

public class Propagation {

    static void show(int a,int b) throws Exception{
        int r = a/b;
        System.out.println(r);
    }
    static void display() throws Exception{
        Scanner S = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = S.nextInt();
        int b = S.nextInt();
        show(a,b);
        S.close();
    }
    public static void main(String[] args) {
        try{
            display();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    
    
}
