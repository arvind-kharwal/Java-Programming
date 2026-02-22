package pack1;
class Two {
    void show(){
        System.out.println("Show in Class Second");
    }
}
public class Second {
    public static void main(String[] args) {
        Two T = new Two();
        T.show();
        One A1 = new One();
        A1.display();
    }
}
