class G1{
    void AAdisplay(){
        System.out.println("AA Class");
    }
}
interface P1{
    void P1display();
}
interface P2{
    void P2display();
}
class C1 extends G1 implements P1,P2{
    public void P1display(){
        System.out.println("Parent 1");
    }
    public void P2display(){
        System.out.println("Parent 2");
    }
}
public class Hybrid {
    public static void main(String[] args) {
        C1 obj1 = new C1();
        obj1.P1display();
    }
    
}
