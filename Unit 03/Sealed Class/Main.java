sealed class ClassA permits ClassB{
    void displayA(){
        System.out.println("Display A method in ClassA");
    }
}
non-sealed class ClassB extends ClassA{
    void displayB(){
        System.out.println("Display B in class B");
    }
}
class Example extends ClassB{
    void show(){
        System.out.println("Show in Example Class");
    }
}
public class Main {
    public static void main(String[] args) {
        ClassB B1 = new ClassB();
        B1.displayA();
        B1.displayB();
    }
}
