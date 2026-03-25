interface Example1{
    void display();
}
public class Main11 {
    int a;
    Main11(int a){
        this.a = a;
    }
    void show(){
        Example1 E1 = ()->System.out.println("The value of a"+a);
        E1.display();
    }
    public static void main(String[] args) {
        Main11 M = new Main11(10);
        M.show();
    }
}
