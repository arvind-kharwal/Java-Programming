abstract class Calculator{
    abstract void display();
}
class Add extends Calculator{
    void display(){
        System.out.println("Addition");
    }
}
class Sub extends Calculator{
    void display(){
        System.out.println("Subtraction");
    }
}

public class Abstract2 {
    public static void main(String[] args) {
        // Calculator C = new Calculator();
        Add A = new Add();
        A.display();
        Sub B = new Sub();
        B.display();
        // Add A = new Sub();
    }
    
}
