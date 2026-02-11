class A{
    A(){
        System.out.println("Parent Constructor");
    }
}
class B extends A{
    B(){
        System.out.println("Child Constructor");
    }
}
public class Main1 {
    public static void main(String[] args) {
        B B1 = new B();
    }
}
