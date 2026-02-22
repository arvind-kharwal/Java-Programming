package pack2;
import pack1.First;

class Three{
    void display3(){
        System.out.println("Display in Class Three");
    }
}
public class Third {
    public static void main(String[] args) {
        Three T = new Three();
        T.display3();
        One X = new One();

    }
}
