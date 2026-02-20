abstract class Example{
    abstract void display();
    void show(){
        System.out.println("Show in Abstract Class");
    }
}
class Test extends Example{
    void display(){
        System.out.println("Display method in Test");
    }
}

public class Main1 {
    public static void main(String[] args) {
        Test T = new Test();
        T.display();
        T.show();
    }
}
