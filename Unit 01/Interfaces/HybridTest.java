class AA{
    void AAdisplay(){
        System.out.println("Display in AA");
    }
}
interface I1{
    void I1display();
}
interface I2{
    void I2display();
}
class ClassHybrid extends AA implements I1,I2{
    public void I1display(){
        System.out.println("Display of I1");
    }
    public void I2display()
    {
        System.out.println("Display in I2");
    }
    void show(){
        System.out.println("Show in ClassHybrid");
    }
}
public class HybridTest {
    public static void main(String[] args) {
        ClassHybrid C1 = new ClassHybrid();
        C1.AAdisplay();
        C1.I1display();
        C1.I2display();
        C1.show();

    }
}
