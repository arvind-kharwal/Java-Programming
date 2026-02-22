interface I1{
    default void display(){
        System.out.println("Display in Interface I1");
    }
}
interface I2 extends I1{
        default void display(){
            System.out.println("Display in I2");
        }
}
interface I3 extends I1{
    default void display(){
        System.out.println("Display in I3");
    }
}
class DiamondExample implements I2,I3{
    public void display(){
        System.out.println("Display in DiamondExample");
        I2.super.display();
        I3.super.display();
    }
}
public class Diamond1 {
    public static void main(String[] args) {
        DiamondExample D = new DiamondExample();
        D.display();
    }
}
