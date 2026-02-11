class Parent{
    void display(){
        System.out.println("I am in display of Parent");
    }
}
class Child extends Parent{
    void display(){
        super.display();
        System.out.println("I am in display of Child");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent P = new Parent();
        P.display();
        Child C = new Child();
        C.display();
    }
}
