interface Sample9{
    void display();
}
public class Main10 {
    int a;
    Main10(int a){
        this.a = a;
    }
    void show(){
        Sample9 S1  =()->System.out.println("The a is "+a);
        Sample9 S2 = ()->System.out.println("This is display");
        S1.display();
        S2.display();
    }
    public static void main(String[] args) {
        Main10 M = new Main10(10);
        M.show();
}
}