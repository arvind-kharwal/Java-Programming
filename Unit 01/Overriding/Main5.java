class Parent5{
    Parent5(){
        System.out.println("Parent5 class");
    }
}
class Child5 extends Parent5{
    Child5(){
        System.out.println("Child5 Class");
    }
}

public class Main5 {
    public static void main(String[] args) {
        Child5 C = new Child5();
    }
}
