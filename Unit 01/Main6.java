interface Test1{
    void display();
}
class Example1 implements Test1{
    public void display(){
        System.out.println("Display");
    }
}
public class Main6 {
    public static void main(String[] args) {
        Example1 E1 = new Example1();
        E1.display();
    }
}
