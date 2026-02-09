abstract class ABS{
    abstract void display();
}
abstract class XYZ extends ABS{
    // no implementation
}
public class Abstract1 {
    public static void main(String[] args) {
        XYZ X = new XYZ();
        X.display();
    }
}
