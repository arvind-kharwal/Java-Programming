class P2{
    void display(){
        System.out.println("P2 class display");
    }
    static void show(){
        System.out.println("P2 class static show");
    }
}
class C2 extends P2{
    void display(){
        System.out.println("C2 class display");
    }
    static void show(){
        System.out.println("C2 class static show");
    }
}
public class Main4 {
    public static void main(String[] args) {
        C2 C = new C2();
        C.display();
        C2.show();
        P2.show();
    }
}
