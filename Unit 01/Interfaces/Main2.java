interface A{
    void display();
}
interface B {
    void show();
    
}
class Demo implements A,B{
    public void display(){
        System.out.println("Hello");
    }
    public void show(){
        System.out.println("World");
    }
}

public class Main2{
    public static void main(String[] args) {
        Demo D = new Demo();
        D.display();
        D.show();
    }
}
