interface Sample9{
    void display();
}
public class Main9 {
    int a;
    Main9(int a){
        this.a = a;
    }
    public static void main(String[] args) {
        Main9 M = new Main9(10);
        Sample9 S1  =()->System.out.println("The a is "+M.a);
        Sample9 S2 = ()->System.out.println("This is display");
        S1.display();
        S2.display();
}
}