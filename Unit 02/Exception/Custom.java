class MyException extends Exception{
    MyException(String message){
        super(message);
    }
}
public class Custom {
    static void display(int n) throws MyException{
        if(n<15)
            throw new MyException("This is an example of custom exception class");
    }
    public static void main(String[] args) {
        try{
            display(10);
        }
        catch(MyException e){
            System.out.println(e.getMessage());
        }
    }
}
