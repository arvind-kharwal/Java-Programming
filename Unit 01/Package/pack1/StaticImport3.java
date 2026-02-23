package pack1;
class Example{
    public static String name = "Arvind";
    public static void display(){
        System.out.println("Static fields and methods");
    }
}
public class StaticImport3 extends Example{
    public static void main(String[] args) {
        Example.display();
    }
}
