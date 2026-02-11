abstract class A{
    abstract void display();
    void show(){
        System.out.println("I am in show() of abstract class A");
    }
}
class B extends A{
    void display(){
        System.out.println("I am in display of class B");
    }
}

public class Abstract3 {
    public static void main(String[] args) {
        B B1 = new B();
        B1.display();
        B1.show();
    }
}
