interface Test1{
    int n = 10;
    void display();
}
class Example1 implements Test1{
    public void display(){
        System.out.println("Display"+n);
    }
}
public class Main6 {
    public static void main(String[] args) {
        Example1 E1 = new Example1();
        E1.display();
        System.out.println(E1.n);
        // int b = (E1.n)++;
    }
}
