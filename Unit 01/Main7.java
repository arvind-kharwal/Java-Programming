interface AA {
    void display();    
}
interface BB{
    void display();
}
class TestAB implements AA,BB{
    public void display(){
        System.out.println("Multiple Inheritance");
    }
}
public class Main7 {
    public static void main(String[] args) {
        TestAB T1 = new TestAB();
        T1.display();
    }
    
}
