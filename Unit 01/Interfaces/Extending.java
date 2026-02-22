interface I1{
    void display();
}
interface I2 extends I1{
    void show();
}
class InterfaceExtend implements I2{
    public void display(){
        System.out.println("Display method");
    }
    public void show(){
        System.out.println("Show Method");
    }
}
public class Extending {
    public static void main(String[] args) {
        InterfaceExtend I1 = new InterfaceExtend();
        I1.display();
        I1.show();
    }
}
