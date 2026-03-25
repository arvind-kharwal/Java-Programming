interface Example2{
    void display();
}
public class Main12 {
    static int a = 10;
    void show(){
        Example2 E1 = ()->System.out.println(a);
        E1.display();
    }
    public static void main(String[] args) {
        Main12 M = new Main12();
        M.show();
        System.out.println(Main12.a);
    }
}
