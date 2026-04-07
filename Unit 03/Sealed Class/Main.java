sealed class ClassA permits ClassB{
    void displayA(){
        System.out.println("Display A method in ClassA");
    }
}
final class ClassB extends ClassA{
    void displayB(){
        System.out.println("Display B in class B");
    }
}
public class Main {
    public static void main(String[] args) {
        
    }
}
