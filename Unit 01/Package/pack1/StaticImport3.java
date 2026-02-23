class Example{
    static String name = "Arvind";
    static void display(){
        System.out.println("Static fields and methods");
    }
}
public class StaticImport3 extends Example{
    public static void main(String[] args) {
        Example.display();
    }
}
