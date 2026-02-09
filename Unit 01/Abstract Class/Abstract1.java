abstract class ABS{
    abstract void display();
}
abstract class XYZ extends ABS{
    // no implementation
}
class Child0 extends XYZ{
    void display(){
        System.out.println("I am in child class");
    }
}
public class Abstract1 {
    public static void main(String[] args) {
        Child0 X = new Child0();
        X.display();
    }
}
