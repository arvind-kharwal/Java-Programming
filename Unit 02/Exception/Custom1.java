import java.util.Scanner;
class MyException1 extends Exception{
    MyException1(String message){
        super(message);
    }
}

public class Custom1 {
    static void display(int a,int b) throws MyException1{
        if(b==0)
            throw new MyException1("Cannot divide by zero");
        else
        {
            int r = a/b;
            System.out.println(r);
        }
    }
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = S.nextInt();
        int b = S.nextInt();
        try{
            display(a,b);
        }
        catch(MyException1 e){
            System.out.println(e.getMessage());
        }
        finally{
            S.close();
        }
        
    }
    
}
