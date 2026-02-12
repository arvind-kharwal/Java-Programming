class P{
    void display(){
        System.out.println("Display of P class");
    }
}
class C extends P{
    void display(){
        System.out.println("Display of C class");
    }
}
public class Dynamic {
    public static void main(String[] args) {
        P  C1 = new C();
        C1.display();

    }
}
